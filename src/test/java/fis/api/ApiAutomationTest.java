package fis.api;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import fis.api.base.ApiBaseClass;
import fis.api.model.response.ApiResponse;
import io.restassured.response.Response;

public class ApiAutomationTest extends ApiBaseClass{

	@Test (testName = "API get call")
	public void ApiGetTest() {
		Response response = get("/v1/bpi/currentprice.json");	// sending GET request
		System.out.println("Response: "+ response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);	// verifying status code
		ApiResponse apiResponse = response.as(ApiResponse.class);
		Assert.assertEquals(apiResponse.getBpi().getClass().getDeclaredFields().length, 3); // verifying there are three nodes under BPIs
		Assert.assertTrue(apiResponse.getBpi().toString().contains("USD"));	// verifying if BPI contains USD
		Assert.assertTrue(apiResponse.getBpi().toString().contains("GBP"));	// verifying if BPI contains GBP
		Assert.assertTrue(apiResponse.getBpi().toString().contains("EUR"));	// verifying if BPI contains EUR
		Assert.assertEquals(apiResponse.getBpi().getGBP().getDescription(), "British Pound Sterling"); // verifying if GBP's description is "British Pound Sterling"
	}
}
