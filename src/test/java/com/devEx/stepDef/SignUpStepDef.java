package com.devEx.stepDef;

import com.devEx.common.DataForApi;
import com.devEx.request.DevExRequest;
import com.devEx.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class SignUpStepDef {

    Response response;
    String token;
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

    @And("Compiler gets the token")
    public void compilerGetsTheToken() {

        token = response.path("token");
        ConfigurationReader.set("newUserToken",token);


    }

    @Given("User creates a POST request and send the token with {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userCreatesAPOSTRequestAndSendTheTokenWith(String company,String website,String location,String status,String skills,String githubUsername,String youtube,String twitter,String facebook,String linkedin,String instagram) {

        response = DevExRequest.postSaveProfile(company, website, location, status, skills, githubUsername, youtube, twitter, facebook, linkedin, instagram);

    }

    @Then("User verify that name as {string} and email as {string}")
    public void userVerifyThatNameAsAndEmailAs(String expectedName, String expectedEmail) {

//        assertEquals(expectedCompany,response.path("company"));
//        assertEquals(expectedLocation,response.path("location"));

        assertEquals(expectedName,response.path("user.name"));
        assertEquals(expectedEmail,response.path("user.email"));

    }
}
