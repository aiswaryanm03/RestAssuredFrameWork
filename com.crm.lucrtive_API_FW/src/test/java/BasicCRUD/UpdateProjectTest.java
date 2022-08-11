package BasicCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	@Test
	public void updateProjectTest()
	{
		//step1:create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "postUsingRestAssured");
		jobj.put("satus", "On Going");
		jobj.put("teamSize", 15);
		//step2: send the request
		
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response res = request.put("http://localhost:8084/projects/TY_PROJ_802");
		//step3: validate response
		res.then().log().all();
		
		
		
	}

}
