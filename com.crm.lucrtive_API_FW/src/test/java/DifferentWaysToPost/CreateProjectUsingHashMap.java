package DifferentWaysToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectUsingHashMap {
	@Test
	public void createProjectUsingHashMap()
	{
		baseURI="http://localhost:8084";
		//step1: create data
		
		Random ran =new Random();
		int random=ran.nextInt(500);
		
		HashMap map=new HashMap();
		map.put("createdBy", "Aishu");
		map.put("projectName", "postUsingHashMap"+random);
		map.put("status", "Created");
		map.put("teamSize", 10);
		given()
		.body(map)
		.contentType(ContentType.JSON)
		//step2: send a request
		.when()
		.post("/addProject")
		//step3: validate the response
		.then().assertThat().statusCode(201).log().all();
		
	}

}
