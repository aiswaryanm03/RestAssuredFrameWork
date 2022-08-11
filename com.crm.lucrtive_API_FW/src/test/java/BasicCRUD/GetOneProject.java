package BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetOneProject {
	@Test
	public void getOneProject()
	{
		// Step1:create all required data
		//step2:send a request
		
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_402");
		//step3:validate the response
		response.then().log().all();
	}

}
