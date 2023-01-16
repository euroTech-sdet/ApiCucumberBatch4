package com.devEx.stepDef;

import com.devEx.common.DataForApi;
import com.devEx.request.DevExRequest;
import com.devEx.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class SignUpStepDef {

    Response response;
    @Given("User creates a POST request with {string} and {string} and {string} and {string} and {string} and {string}")
    public void userCreatesAPOSTRequestWithAndAndAndAndAnd(String email, String password, String name, String google, String facebook, String github) {


     response= DevExRequest.registerNewUser(email, password, name, google, facebook, github);
     response.prettyPrint();

    }

    @Then("Verify that body contains {string}")
    public void verifyThatBodyContains(String token) {

        assertTrue(response.body().asString().contains(token));

    }

    @Then("Verify that status code should be {int}")
    public void verifyThatStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode,response.statusCode());
    }
}
