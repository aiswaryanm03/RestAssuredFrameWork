package SearilizationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerialixationAndDeserializtion.EmployeeDetailsWithArray;

public class DesearilzationEmpdetailswithArray {
	@Test
	public void DesearilizationempdetWitharray() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		EmployeeDetailsWithArray details = obj.readValue(new File(".\\Employeedetailswitharray.json"), EmployeeDetailsWithArray.class);
	System.out.println(details.getEmail()[0]);
	System.out.println(details.getNumber()[1]);
	}

}
