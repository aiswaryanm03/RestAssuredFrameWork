package DifferentWaysToPost;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithPOJO {
	@Test
	public void createProjectWithPOJO()
	{
		baseURI="http://localhost:8084";
		ProjectLibrary plib=new ProjectLibrary("Aishu", "Create using pojo class", "created",10 );
		given()
		.body(plib).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

}
