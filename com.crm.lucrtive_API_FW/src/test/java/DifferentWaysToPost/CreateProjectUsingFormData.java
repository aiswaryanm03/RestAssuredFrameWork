package DifferentWaysToPost;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingFormData {
	@Test
	public void createProjectUsingFormData()
	{
		baseURI="http://localhost:8084";
		Random ran=new Random();
		int random=ran.nextInt(500);
		//Step1:create required deatils or prerequisits
		given()
		.formParam("createdBy","Aishu")
		.formParam("projectName", "postUsingFormData"+random)
		.formParam("status", "Created")
		.formParam("teamSize", 10)
		.contentType(ContentType.JSON)
		//send the request
		.when().post("/addProject")
			
		.then().assertThat().statusCode(201).log().all();
			
		
		
		
	}

}
