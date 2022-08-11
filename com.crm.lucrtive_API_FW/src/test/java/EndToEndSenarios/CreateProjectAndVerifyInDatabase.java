package EndToEndSenarios;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectAndVerifyInDatabase extends BaseAPIClass {
	@Test
	public void createProjectVerifyDatabase() throws SQLException
	{
		
		//create a project using post request
		ProjectLibrary plib=new ProjectLibrary("Aishu", "project usingFW"+jlib.RandomNumber(), "created", 10);
	
		Response res = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointsLibrary.createProject);
		 String expectedData = ralib.getJsonData(res, "projectId");
		 Reporter.log(expectedData,true);
		res.then().log().all();
		//get a project using get request
		given()
		.pathParam("pid", expectedData)
		.when()
		.get(EndPointsLibrary.getSingleProject+"{pid}")
		.then().assertThat().statusCode(200).log().all();
		
		
		
		//verify in a database 
		String query="select * from project;";
		String actData=dlib.readDataFromDBAndValidate(query, expectedData, 1);
		Assert.assertEquals(expectedData, actData);
		
		
		
		
	}

}
