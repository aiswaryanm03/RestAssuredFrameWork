package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateUpdateGetDeleteProject {
	@Test
	public void CreateUpGetDelPro()
	{
		Random ran=new Random();
		int random=ran.nextInt(400);
		//prerequisits
		baseURI="http://localhost:8084";
		ProjectLibrary plib=new ProjectLibrary("Aishu", "request cahining for pugd"+random, "created", 10);
		//step1:create a data and send post request


		Response res = given()
				.body(plib).contentType(ContentType.JSON)
				.when().post("/addProject");
		String proid=res.jsonPath().get("projectId");
		//System.out.println(pid);
		res.then().log().all();

		//update a project for status using put

		ProjectLibrary plib1=new ProjectLibrary("Aishu", "request cahining for pugd"+random, "completed", 10);
		given()
		.pathParam("pid1", proid)
		.body(plib1)
		.contentType(ContentType.JSON)		
		.when().put("/projects/{pid1}")
		//String pid1=res1.jsonPath().get("projectId");

		.then().assertThat().statusCode(200).log().all();

		//get a project using projectid
		//String proid1=res.jsonPath().get("projectId");
		given()
	   .pathParam("pid2", proid)
		.when()
		.get("/projects/{pid2}").then().assertThat().statusCode(200);

		//delete project
		given()
		   .pathParam("pid2", proid)
		.when().delete("/projects/{pid2}").then().assertThat().statusCode(204);







	}

}
