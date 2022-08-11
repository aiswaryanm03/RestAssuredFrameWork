package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	public void queryparameter()
	{
		baseURI="https://reqres.in";
		given().queryParam("page", 2)
		.when().get("/api/users")
		.then().log().all();
	
	}

}
