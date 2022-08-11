package BasicCRUDWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class UpdateProjectTest {
	@Test
	public void updatProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		Random ran =new Random();
		int random=ran.nextInt(500);
		//step1:create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Aishu");
		jobj.put("projectName", "UpdateusingBDDAproach"+random);
		jobj.put("status", "On Going");
		jobj.put("teamSize", 10);
		given()
		.body(jobj).contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_002")
		.then().assertThat().statusCode(200).log().all();
		
	}
	
	
	

}
