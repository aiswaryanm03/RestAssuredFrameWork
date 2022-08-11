package BasicCRUDWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectTest {

	@Test
	public void craeteProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		Random ran =new Random();
		int random=ran.nextInt(500);
		//step1:create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "postUsingBDDAproach"+random);
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);
		//Step2:send request
		given()
		
		.body(jobj).contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
	}

}
