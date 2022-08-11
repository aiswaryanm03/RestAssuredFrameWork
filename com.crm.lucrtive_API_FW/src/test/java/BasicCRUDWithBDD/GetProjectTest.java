package BasicCRUDWithBDD;

import org.openqa.selenium.remote.RemoteWebDriver.When;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProjectTest {
	@Test
	public void getProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		when()
		.get("/projects/TY_PROJ_002").then().assertThat().statusCode(200).log().all();
		
	}

}
