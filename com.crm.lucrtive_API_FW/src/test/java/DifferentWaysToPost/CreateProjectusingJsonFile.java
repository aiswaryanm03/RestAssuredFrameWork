package DifferentWaysToPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectusingJsonFile 
{
	@Test
	public void createprojectUsingjsonFile()
	{
		baseURI="http://localhost:8084";
		File file=new File(".\\src\\test\\resources\\jsonfile.json");
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
			.assertThat().statusCode(201).log().all();
	
	}

}
