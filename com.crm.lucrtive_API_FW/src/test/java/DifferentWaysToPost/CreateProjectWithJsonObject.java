package DifferentWaysToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithJsonObject {
	@Test
	public void createProjectWithJsonObject()
	{
		baseURI="http://localhost:8084";
		//step1: create data
		Random ran =new Random();
		int random=ran.nextInt(500);
		//step1:create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "postUsingJsonObject"+random);
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		//step2:send a request
		.when()
		.post("/addProject")
		//step3:validate response
		.then().assertThat().statusCode(201).log().all();
		
		
	
	}

}
