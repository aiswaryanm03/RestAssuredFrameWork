package SearilizationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerialixationAndDeserializtion.EmployeeDetailsWithObject;

public class DerializationEmpWithObject {
	@Test
	public void DesearilizationEmpWithObjectTest() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		 EmployeeDetailsWithObject value = obj.readValue(new File(".\\EmployeewithObject.json"), EmployeeDetailsWithObject.class);
		System.out.println(value.getS().getEid());
		//System.out.println(value.getS());
		
	}

}
