package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectandGetProject {
	@Test

	public void createProjectAndGetPro()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		// pre requisite tp create a project using pojo class
		baseURI="http://localhost:8084";
		ProjectLibrary plib=new ProjectLibrary("aishu", "post using request chaining"+random, "created", 10);
		Response res = given()
				.body(plib)
				.contentType(ContentType.JSON)
				.when().post("/addProject");
		//capture the response here project id
		String pro_ID = res.jsonPath().get("projectId");
				System.out.println(pro_ID);
		res.then().log().all();
		
		//create a request and pass project id as path parameter or as varialble
		
		//using path parameter
		given().pathParam("pid", pro_ID)
		.when().get("/projects/{pid}")
		.then().assertThat().statusCode(200).log().all();
		
		
				
			
		
		
	}
	
	

}
