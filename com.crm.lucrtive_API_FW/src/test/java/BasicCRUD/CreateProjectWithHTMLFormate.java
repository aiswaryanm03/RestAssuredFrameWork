package BasicCRUD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectWithHTMLFormate {
	@Test
	public void createProjectWithHtmlFormat()
	{
		Random ran =new Random();
		int random=ran.nextInt(500);
		//step1:create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "postUsinghtmlformat"+random);
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.HTML);
		Response res = request.post("http://localhost:8084/addProject");
		res.then().log().all();
	}

}
