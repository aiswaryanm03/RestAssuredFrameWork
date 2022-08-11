package BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteOneProject {
	@Test
	public void deleteoneProject()
	{
		//step1:create required data
		//step2:send a request
		
		Response res = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_402");
		
		//step3:validate the response
		
		res.then().log().all();
	}

}
