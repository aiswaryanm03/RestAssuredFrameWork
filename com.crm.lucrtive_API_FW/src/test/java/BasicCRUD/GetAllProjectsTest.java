package BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {
	@Test
	public void getAllProjectsTest()
	{
		//step1:create required data
		//step2: send the request
		Response res = RestAssured.get("http://localhost:8084/projects");
		//step3:validate the response
		res.then().log().all();
	}

}
