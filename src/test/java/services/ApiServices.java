package services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class ApiServices {
    public HttpResponse<JsonNode> postMethod(String header1, String header2, String url, String body) throws UnirestException {
        return Unirest.post(url).header(header1, header2).body(body).asJson();
    }

    public static HttpResponse<JsonNode> getMethod(String header1, String header2, String url) throws UnirestException {
        return Unirest.get(url).header(header1, header2).asJson();
    }

    public static HttpResponse<JsonNode> getMethod( String url) throws UnirestException {
        return Unirest.get(url).asJson();
    }
}
