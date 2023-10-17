package steps;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.cucumber.java.en.Given;
import org.json.JSONObject;
import org.junit.Assert;
import services.ApiServices;
import services.DriverManager;

import javax.swing.event.HyperlinkEvent;

public class ApiSteps {
    HttpResponse<JsonNode> response;
    @Given("^Consultar departamentos '(.*)'$")
    public void getDto(String url) throws UnirestException {

        response = ApiServices.getMethod("Content-Type", "application/json", url);
        Assert.assertEquals(200, response.getStatus());


    }
    @Given("^Verificar existan departamentos$")
    public void verifyDto() throws UnirestException {

        JSONObject jsonObject = response.getBody().getObject();
        Assert.assertFalse(jsonObject.isNull("departments"));

    }

}
