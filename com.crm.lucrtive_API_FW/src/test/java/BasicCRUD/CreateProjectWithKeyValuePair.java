package BasicCRUD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectWithKeyValuePair {
	@Test
	public void createProjectWithkeyValuePair()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		//Step1:create required deatils
		RequestSpecification rest=RestAssured.given();
		rest.formParam("createdBy","Aishu");
		rest.formParam("projectName", "postUsingFormData"+random);
		rest.formParam("status", "Created");
		rest.formParam("teamSize", 10);
		rest.contentType(ContentType.JSON);
		Response response = rest.post("http://localhost:8084/addProject");
		response.then().log().all();
	}

}
