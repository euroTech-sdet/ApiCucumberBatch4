package com.devEx.stepDef;

import com.devEx.utilities.ConfigurationReader;
import com.devEx.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.reset;

public class Hooks {



    @Before
    public void setup(){

            baseURI = ConfigurationReader.get("baseURI");

    }
    @After
    public void tearDown(){

        reset();
        Driver.closeDriver();
    }
}
