package SearilizationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerialixationAndDeserializtion.EmployeeDetailsWithArray;

public class SearlizationForEmployeeDetailWithArray {

	@Test
	public void empdetailWithArray() throws Throwable, JsonMappingException, IOException
	{
		int[]phnumber= {123,456};
		String []emil= {"aish@gamil","aish@tyss"};
		EmployeeDetailsWithArray empd=new EmployeeDetailsWithArray("aishu", "tyss123", phnumber, emil, "ballari");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./Employeedetailswitharray.json"), empd);
	}

}
