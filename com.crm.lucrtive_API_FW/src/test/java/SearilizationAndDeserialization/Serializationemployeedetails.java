package SearilizationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerialixationAndDeserializtion.EmployeeDetails;

public class Serializationemployeedetails {
	@Test
	public void SerializeEmpDetailsTest() throws Throwable, JsonMappingException, IOException
	{
		//step1:crate object for pojo class and provide values
		EmployeeDetails emp=new EmployeeDetails("Aishwarya","ty234", 123453, "aish@gmail.com", "Ballari");
		
		//step2:create object for object mapper from jackson mapper
		ObjectMapper obj=new ObjectMapper();
		

		//step3: write data into json file
		obj.writeValue(new File("./EmployeeDetails.json"), emp);
		
		
		
		
	}
	
	
	

}
