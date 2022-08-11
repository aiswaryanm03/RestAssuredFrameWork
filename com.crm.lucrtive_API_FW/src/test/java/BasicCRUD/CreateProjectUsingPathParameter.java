package BasicCRUD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingPathParameter {
	@Test
	public void createProjectUsingPathParameter()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "postUsingPathParameter"+random);
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		request.pathParam("project_id","addProject");
		Response response = request.post("http://localhost:8084/{project_id}");
		response.then().log().all();
		
	
	}

}
