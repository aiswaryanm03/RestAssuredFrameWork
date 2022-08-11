package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static  io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {
	@Test
	public void dynamicResponseValidation()
	{
		baseURI="http://localhost:8084";
		String expected_data="TY_PROJ_1002";
		//step1:send a requesr and validate the response
		// capture a response by using jsonpath
		Response res = when().get("/projects");
		boolean flag=false;
		List<String> pid=res.jsonPath().get("projectId");
		for(String projectId:pid)
		{
			
			if(projectId.equals(expected_data))
			{
				flag=true;//flag raising
				break;
				
			}
		}
		//step3:validate
		
		Assert.assertTrue(flag);
		
		
		
	}

}
