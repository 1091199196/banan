package com.saveMaterial;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;

import java.nio.charset.StandardCharsets;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

public class httpUtil {
    public static final ContentType TEXT_PLAIN = ContentType.create("text/plain", StandardCharsets.UTF_8);
    // 从连接时获取时间
    public static int CONNECTION_REQUEST_TIMEOUT = 1000;
    // 建立连接时间（三次握手时间）
    public static int CONNECTION_TIMEOUT = 2000;
    // 服务器返回数据时间
    public static int SOCKET_TIMEOUT = 50000;
    /**
     * HttpClient 连接池
     */
    private static PoolingHttpClientConnectionManager cm = null;

    static {
        // 初始化连接池，可用于请求HTTP/HTTPS（信任所有证书）
        cm = new PoolingHttpClientConnectionManager(getRegistry());
        // 整个连接池最大连接数
        cm.setMaxTotal(100);
        // 每路由最大连接数，默认值是2
        cm.setDefaultMaxPerRoute(5);
    }

    /**
     * 获取 HTTPClient注册器
     *
     * @return
     * @throws Exception
     */
    private static Registry<ConnectionSocketFactory> getRegistry() {
        Registry<ConnectionSocketFactory> registry = null;

        try {
            registry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", new PlainConnectionSocketFactory()).register("https", getSSLFactory()).build();
        } catch (Exception e) {
            System.out.println("获取 HTTPClient注册器失败" + e);
        }
        return registry;
    }

    /**
     * 获取HTTPS SSL连接工厂
     * <p>
     * 跳过证书校验，即信任所有证书
     * </p>
     *
     * @return
     * @throws Exception
     */
    private static SSLConnectionSocketFactory getSSLFactory() throws Exception {
        // 设置HTTPS SSL证书信息，跳过证书校验，即信任所有证书请求HTTPS
        SSLContextBuilder sslBuilder = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
            @Override
            public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                return true;
            }
        });

        // 获取HTTPS SSL证书连接上下文
        SSLContext sslContext = sslBuilder.build();
        // 获取HTTPS连接工厂
        SSLConnectionSocketFactory sslCsf = new SSLConnectionSocketFactory(sslContext,
                new String[]{"SSLv2Hello", "SSLv3", "TLSv1", "TLSv1.2"}, null, NoopHostnameVerifier.INSTANCE);
        return sslCsf;
    }

    /**
     * 发送 HTTP GET请求
     * <p>
     * 不带请求参数和请求头
     * </p>
     *
     * @param url 地址
     * @return
     * @throws Exception
     */
    public static String httpGet(String url) throws Exception {
        HttpGet httpGet = new HttpGet(url);

        return doHttp(httpGet);
    }

    /**
     * 发送 HTTP GET请求
     * <p>
     * 带请求参数，不带请求头
     * </p>
     *
     * @param url    地址
     * @param params 参数
     * @return
     * @throws Exception
     * @throws Exception
     */
    public static String httpGet(String url, Map<String, Object> params) throws Exception {
        // 转换请求参数
        List<NameValuePair> pairs = covertParams2NVPS(params);

        // 装载请求地址和参数
        URIBuilder ub = new URIBuilder();
        ub.setPath(url);
        ub.setParameters(pairs);

        HttpGet httpGet = new HttpGet(ub.build());

        return doHttp(httpGet);
    }

    /**
     * 发送 HTTP GET请求
     * <p>
     * 带请求参数和请求头
     * </p>
     *
     * @param url     地址
     * @param headers 请求头
     * @param params  参数
     * @return
     * @throws Exception
     * @throws Exception
     */
    public static String httpGet(String url, Map<String, Object> headers, Map<String, Object> params) throws Exception {
        // 转换请求参数
        List<NameValuePair> pairs = covertParams2NVPS(params);

        // 装载请求地址和参数
        URIBuilder ub = new URIBuilder();
        ub.setPath(url);
        ub.setParameters(pairs);

        HttpGet httpGet = new HttpGet(ub.build());
        // 设置请求头
        for (Map.Entry<String, Object> param : headers.entrySet())
            httpGet.addHeader(param.getKey(), String.valueOf(param.getValue()));

        return doHttp(httpGet);
    }

    /**
     * @param @param  param
     * @param @return
     * @throws Exception
     * @Description: 将map转换成可拼接传输的url字符串后缀参数
     * @author songrj
     * @date 2019年6月13日 下午7:38:50
     * @return: String
     */
    public static String mapToParamString(Map<String, String> param) {
        StringBuilder stringBuilder = new StringBuilder();
        if (param == null || param.size() == 0) {
            return stringBuilder.toString();
        } else {
            for (Map.Entry<String, String> entry : param.entrySet()) {
                stringBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            return stringBuilder.substring(0, stringBuilder.length() - 1);
        }
    }


    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String httpGetString(String url, Map<String, String> param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + mapToParamString(param);
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String httpPostString(String url, Map<String, String> param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + mapToParamString(param);
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }


    /**
     * 发送 HTTP POST请求
     * <p>
     * 不带请求参数和请求头
     * </p>
     *
     * @param url 地址
     * @return
     * @throws Exception
     */
    public static String httpPost(String url) throws Exception {
        HttpPost httpPost = new HttpPost(url);

        return doHttp(httpPost);
    }

    /**
     * 发送 HTTP POST请求
     * <p>
     * 带请求参数，不带请求头
     * </p>
     *
     * @param url    地址
     * @param params 参数
     * @return
     * @throws Exception
     */
    public static String httpPost(String url, Map<String, Object> params) throws Exception {
        // 转换请求参数
        List<NameValuePair> pairs = covertParams2NVPS(params);

        HttpPost httpPost = new HttpPost(url);
        // 设置请求参数
        httpPost.setEntity(new UrlEncodedFormEntity(pairs, StandardCharsets.UTF_8.name()));

        return doHttp(httpPost);
    }

    /**
     * 发送 HTTP POST请求
     * <p>
     * 带请求参数和请求头
     * </p>
     *
     * @param url     地址
     * @param headers 请求头
     * @param params  参数
     * @return
     * @throws Exception
     */
    public static String httpPost(String url, Map<String, Object> headers, Map<String, Object> params)
            throws Exception {
        // 转换请求参数
        List<NameValuePair> pairs = covertParams2NVPS(params);

        HttpPost httpPost = new HttpPost(url);
        // 设置请求参数
        httpPost.setEntity(new UrlEncodedFormEntity(pairs, StandardCharsets.UTF_8.name()));
        // 设置请求头
        for (Map.Entry<String, Object> param : headers.entrySet())
            httpPost.addHeader(param.getKey(), String.valueOf(param.getValue()));

        return doHttp(httpPost);
    }

    /**
     * 发送 HTTP POST请求，参数格式JSON
     * <p>
     * 请求参数是JSON格式，数据编码是UTF-8
     * </p>
     *
     * @param url
     * @param param
     * @return
     * @throws Exception
     */
    public static String httpPostJson(String url, String param) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        // 设置请求头
        httpPost.addHeader("Content-Type", "application/json; charset=UTF-8");
        // 设置请求参数
        httpPost.setEntity(new StringEntity(param, StandardCharsets.UTF_8.name()));

        return doHttp(httpPost);
    }

    /**
     * application/x-www-form-urlencoded
     *
     * @param url
     * @param map
     * @return
     * @throws Exception
     */
    public static String httpPostXwwwform(String url, Map<String, String> map) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        // 设置请求头
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
        // 设置请求参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        if (map != null) {
            for (Entry<String, String> entry : map.entrySet()) {
                nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, StandardCharsets.UTF_8.name()));
        return doHttp(httpPost);
    }

    /**
     * 将Map键值对拼接成QueryString字符串，UTF-8编码
     *
     * @param params
     * @return
     * @throws Exception
     */
    public static String getQueryStr(Map<String, Object> params) throws Exception {
        return URLEncodedUtils.format(covertParams2NVPS(params), StandardCharsets.UTF_8.name());
    }

    /**
     * 发送 HTTP 请求
     *
     * @param request
     * @return
     * @throws Exception
     */
    private static String doHttp(HttpRequestBase request) throws Exception {
        Builder builder = RequestConfig.custom();
        RequestConfig config = builder.setSocketTimeout(SOCKET_TIMEOUT).setConnectTimeout(CONNECTION_TIMEOUT)
                .setConnectionRequestTimeout(CONNECTION_REQUEST_TIMEOUT).build();
        // 通过连接池获取连接对象
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(config).setConnectionManager(cm)
                .build();

        return doRequest(httpClient, request);
    }

    /**
     * 处理Http/Https请求，并返回请求结果
     * <p>
     * 注：默认请求编码方式 UTF-8
     * </p>
     *
     * @param httpClient
     * @param request
     * @return 请求结果
     * @throws Exception
     */
    private static String doRequest(CloseableHttpClient httpClient, HttpRequestBase request) throws Exception {
        String result = null;
        CloseableHttpResponse response = null;

        try {
            // 获取请求结果
            response = httpClient.execute(request);
            // 解析请求结果
            HttpEntity entity = response.getEntity();
            // 转换结果
            result = EntityUtils.toString(entity, StandardCharsets.UTF_8.name());
            // 关闭IO流
            EntityUtils.consume(entity);
        } finally {
            if (null != response)
                response.close();
        }

        return result;
    }

    /**
     * 转换请求参数
     *
     * @param params map参数
     * @return nameValuePair集合
     */
    private static List<NameValuePair> covertParams2NVPS(Map<String, Object> params) {
        List<NameValuePair> pairs = new ArrayList<NameValuePair>();

        for (Map.Entry<String, Object> param : params.entrySet())
            pairs.add(new BasicNameValuePair(param.getKey(), String.valueOf(param.getValue())));

        return pairs;
    }


    /**
     * 下载文件方法 InputStream
     */
    public static String httpPostJsonFile(String url, String param) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        // 设置请求头
        httpPost.addHeader("Content-Type", "application/json; charset=UTF-8");
        // 设置请求参数
        httpPost.setEntity(new StringEntity(param, StandardCharsets.UTF_8.name()));
        Builder builder = RequestConfig.custom();
        RequestConfig config = builder.setSocketTimeout(SOCKET_TIMEOUT).setConnectTimeout(CONNECTION_TIMEOUT)
                .setConnectionRequestTimeout(CONNECTION_REQUEST_TIMEOUT).build();
        // 通过连接池获取连接对象
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(config).setConnectionManager(cm)
                .build();
        InputStream in = null;
        CloseableHttpResponse response = null;
        byte[] data = null;
        try {
            // 获取请求结果
            response = httpClient.execute(httpPost);
            // 解析请求结果
            HttpEntity entity = response.getEntity();
            // 获取文件流
            in = entity.getContent();
            ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
            byte[] buff = new byte[100];
            int rc = 0;
            while ((rc = in.read(buff, 0, 100)) > 0) {
                swapStream.write(buff, 0, rc);
            }
            data = swapStream.toByteArray();
            in.close();
            // 关闭IO流
            EntityUtils.consume(entity);
        } finally {
            if (null != response)
                response.close();
        }
        return null; //new String(Base64.getEncoder().encode(data));
    }

    /**
     * 文件参数上传
     *
     * @param url
     * @param accessToken
     * @param map
     * @return
     * @throws Exception
     */
    public static String httpPostFiles(String url, String accessToken, Map<String, String> map) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        //ContentType contentType = ContentType.create("text/plain", Charset.forName("UTF-8"));
        // 文件上传
        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create()
                .setMode(HttpMultipartMode.RFC6532);
        File file = new File(map.get("file"));
        multipartEntityBuilder.addBinaryBody("file", file);
        multipartEntityBuilder.addTextBody("accessToken", accessToken);
        multipartEntityBuilder.addTextBody("matterId", map.get("matterId"));
        multipartEntityBuilder.addTextBody("code", map.get("code"));
        multipartEntityBuilder.addTextBody("userIdNumber", map.get("userIdNumber"));
        multipartEntityBuilder.addTextBody("attDefId", map.get("attDefId"));
        HttpEntity httpEntity = multipartEntityBuilder.build();
        httpPost.setEntity(httpEntity);
        return doHttp(httpPost);
    }
   public  static  String sendMaterial(String url) throws Exception{
       String appKey = "604355826060099584";
       String appSecret = "7aec0127fcf04cfab751cec717446f65";
       HttpPost httpPost = new HttpPost(url);
       //ContentType contentType = ContentType.create("text/plain", Charset.forName("UTF-8"));
       //加密
       httpPost.setHeader("","");
       httpPost.setHeader("","");
       httpPost.setHeader("","");
       httpPost.setHeader("","");
       httpPost.setHeader("","");
       httpPost.setHeader("","");
       // 文件上传
       MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create()
               .setMode(HttpMultipartMode.RFC6532);
       multipartEntityBuilder.addTextBody("appKey", appKey);
       multipartEntityBuilder.addTextBody("appSecret", appSecret);
       File file = new File("C:\\Users\\86187\\Desktop\\aaa.jpg");
       multipartEntityBuilder.addBinaryBody("file_url", file);
       multipartEntityBuilder.addTextBody("uid", "self");
       multipartEntityBuilder.addTextBody("type", "doc");
       multipartEntityBuilder.addTextBody("folder_name", "baNan/material");
       multipartEntityBuilder.addTextBody("server_url", "http://23.99.127.113:8084/upload");
       HttpEntity httpEntity = multipartEntityBuilder.build();
       httpPost.setEntity(httpEntity);
       return doHttp(httpPost);
   }


}
