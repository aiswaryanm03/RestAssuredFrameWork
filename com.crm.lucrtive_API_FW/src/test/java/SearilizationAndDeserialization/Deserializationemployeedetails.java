package SearilizationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerialixationAndDeserializtion.EmployeeDetails;

public class Deserializationemployeedetails {
	@Test
	public void deserializeEmployeeDetails() throws JsonParseException, JsonMappingException, IOException
	{
		//Create an object of object mapper to read a data frm json file
		ObjectMapper obj=new ObjectMapper();
		EmployeeDetails ele = obj.readValue(new File("./EmployeeDetails.json"), EmployeeDetails.class);
		System.out.println(ele.getAdress());
		
				
	}

}
