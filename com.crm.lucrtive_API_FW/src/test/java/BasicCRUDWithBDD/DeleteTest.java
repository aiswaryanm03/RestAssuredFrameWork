package BasicCRUDWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteTest {
	@Test
	public void deleteTest()
	{
		baseURI="http://localhost";
		port=8084;
		when()
		.delete("/projects/TY_PROJ_002")
		.then().assertThat().statusCode(204).log().all();
	}

}
