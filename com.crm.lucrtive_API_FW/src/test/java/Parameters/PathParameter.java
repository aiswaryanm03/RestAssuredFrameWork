package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
	@Test
	public void pathParameter()
	{
		baseURI="http://localhost:8084";
		given().pathParam("pid","TY_PROJ_1214")
		.when().get("/projects/{pid}")
		.then().assertThat().statusCode(200).log().all();
			
		
	}
	

}
