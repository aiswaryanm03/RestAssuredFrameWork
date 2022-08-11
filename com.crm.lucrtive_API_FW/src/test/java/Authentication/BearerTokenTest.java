package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerTokenTest {
	@Test
	public void bearerTokenTest()
	{//create a prerequisite
		baseURI="https://api.github.com";
		JSONObject obj=new JSONObject();
		obj.put("name", "sdet_36_restassured");
		obj.put("description", "restassured_api");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		//send a request and validate
		.when().post("/user/repos")
		.then().assertThat().statusCode(202).log().all();
		
		
	}

}
