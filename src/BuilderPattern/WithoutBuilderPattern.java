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



}



public class WithoutBuilderPattern {
    public static void main(String[] args) {

    }
}
