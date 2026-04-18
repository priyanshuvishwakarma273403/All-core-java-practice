package BuilderPattern;

import java.util.HashMap;
import java.util.Map;

class HttpRequest{
    private String url;
    private String method;
    private Map<String, String> headers;
    private Map<String , String> queryParams;
    private String body;
    private int timeout;

    public HttpRequest(String url){
        this.url = url;
        this.method = "GET";
        this.timeout = 30;
        this.headers = new HashMap<>();
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method){
        this.url = url;
        this.method = method;
        this.timeout = 30;
        this.headers = new HashMap<>();
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method, int timeout){
        this.url = url;
        this.method = method;
        this.timeout = timeout;
        this.headers = new HashMap<>();
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method,int timeout, Map<String, String> headers){
        this.url = url;
        this.method = method;
        this.timeout = timeout;
        this.headers = headers;
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method, int timeout,
                       Map<String, String> headers, Map<String,String> queryParams) {
        this.url = url;
        this.method = method;
        this.timeout = timeout;
        this.headers = headers;
        this.queryParams = queryParams;
    }

    public HttpRequest(String url, String method, int timeout,
                       Map<String, String> headers, Map<String,String> queryParams, String body) {
        this.url = url;
        this.method = method;
        this.timeout = timeout;
        this.headers = headers;
        this.queryParams = queryParams;
        this.body = body;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public void addQueryParam(String key, String value) {
        queryParams.put(key, value);
    }


    public void setBody(String body) {
        this.body = body;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void execute(){
        System.out.println("Executing " + method + " request to " + url);

        if(!queryParams.isEmpty()){
            System.out.println("Query Parameters");
            for(Map.Entry<String, String> param : queryParams.entrySet()){
                System.out.println("  " + param.getKey() + "=" + param.getValue());
            }
        }

        System.out.println("Headers:");
        for(Map.Entry<String, String> param : headers.entrySet()){
            System.out.println("  " + param.getKey() + "=" + param.getValue());
        }

        if (body != null && !body.isEmpty()) {
            System.out.println("Body: " + body);
        }

        System.out.println("Timeout: " + timeout + " seconds");
        System.out.println("Request executed successfully!");
    }
}

public class WithoutBuilderPattern {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequest("https://api.example.com");
        HttpRequest request2 = new HttpRequest("https://api.example.com", "POST");
        HttpRequest request3 = new HttpRequest("https://api.example.com", "PUT", 60);

        HttpRequest request4 = new HttpRequest("https://api.example.com");
        request4.setMethod("POST");
        request4.addHeader("Content-Type", "application/json");
        request4.addQueryParam("key", "12345");
        request4.setBody("{\"name\": \"Priyanshu\"}");
        request4.setTimeout(60);

        request4.execute();

    }
}
