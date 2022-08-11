package GenericLibrary;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * this class is used for scheduling
 * @author Lenovo
 *
 */
 
public class BaseAPIClass {
	
	public JavaLibrary jlib=new JavaLibrary();
	public DataBaseLibrary dlib=new DataBaseLibrary();
	public RestAssuredLibrary ralib=new RestAssuredLibrary();
	@BeforeSuite
	public void configBS() throws SQLException
	{
		dlib.connectDB();
		Reporter.log("====conected to database===",true);
		baseURI="http://localhost";
		port=8084;
		
	}
	@AfterSuite
	public void configAS() throws SQLException
	{
		dlib.closeDB();
		Reporter.log("===database connection closed====",true);
	}

}
