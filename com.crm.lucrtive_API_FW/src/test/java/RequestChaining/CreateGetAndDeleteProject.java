package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateGetAndDeleteProject {
	@Test
	public void CreategetDelete()
	{
		//prerequisit
		baseURI="http://localhost:8084";
		ProjectLibrary plib=new ProjectLibrary("Aishu", "requestchaning", "created", 11);
		//create the project
		Response res = given()
		.body(plib).contentType(ContentType.JSON)
		.when().post("/addProject");
		//get the response
		String pid=res.jsonPath().get("projectId");
		System.out.println(pid);
		//send get request and capture projectid
		
		when().get("/projects/"+pid)
		.then().assertThat().statusCode(200).log().all();
		// delete the project
		when().delete("/projects/"+pid)
		.then().assertThat().statusCode(204);
		
		
	}

}
