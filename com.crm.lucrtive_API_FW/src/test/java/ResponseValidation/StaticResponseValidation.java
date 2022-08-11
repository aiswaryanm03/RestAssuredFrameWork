package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	@Test
	public void staticResponseValidation()
	{
		baseURI="http://localhost:8084";
		String actual_data="TY_PROJ_1002";
		//step1:send a request and validate the response
		
		Response res = when().get("/projects");
		String data=res.jsonPath().get("[0].projectId");
		Assert.assertEquals(data,actual_data);
		System.out.println(data);
		//res.then().log().all();
	}

}
