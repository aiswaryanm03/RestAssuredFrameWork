package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Ouath2Test {
	@Test
	public void outh2Test()
	{
		//step1: generate the access token
		baseURI="http://coop.apps.symfonycasts.com";
		Response res = given()
		.formParam("client_id", "Aishwarya_RestAssured")
		.formParam("client_secret", "bc7aa62fe6a87558de23c93682fc81a8")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://aishwarya.com")
		.formParam("code","authorization_code")
		
		.when()
		.post("/token");
		res.then().log().all();
		
		//step2:capture the token using jsonpath
		String access_token = res.jsonPath().get("access_token");
		System.out.println(access_token);
		
		//step3:utilise the token
		
		given()
		.auth().oauth2(access_token)
		.pathParam("USER_ID", 3676)
		
		.when()
		.post("	/api/{USER_ID}/chickens-feed")
		.then().log().all();
		
		
		
		
		
		
		
		
	}
	

}
