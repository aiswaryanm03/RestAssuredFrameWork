package BasicCRUD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	public void createProjectTest()
	{
		//create random number
		Random ran =new Random();
		int random=ran.nextInt(500);
		//step1:create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "postUsingRestAssured"+random);
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);
		
		//step2:send the request
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp = request.post("http://localhost:8084/addProject");
		//step3:validate the response
		//System.out.println(resp.prettyPeek());
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
	}

}
