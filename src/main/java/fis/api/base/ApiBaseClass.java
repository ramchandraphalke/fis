package fis.api.base;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class ApiBaseClass {
	@BeforeMethod
    public void apiSetup() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://api.coindesk.com")
                .setContentType("application/json")
                .build();
    }
}
