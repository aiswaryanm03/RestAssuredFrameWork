package DifferentWaysToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingComplexData {
	@Test
	
	public void createProjectWithComplexData()
	{
		baseURI="https://petstore.swagger.io/v2";
		JSONObject jobj=new JSONObject();
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when().post("/addProject").then().assertThat().statusCode(201).log().all();
		
		
	}

}
