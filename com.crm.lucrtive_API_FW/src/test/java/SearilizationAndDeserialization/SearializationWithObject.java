package SearilizationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerialixationAndDeserializtion.EmployeeDetailsWithObject;
import POJOforSerialixationAndDeserializtion.Spouse;
import POJOforSerialixationAndDeserializtion.Spouse2;

public class SearializationWithObject {
	@Test
	public void serializationWithObject() throws Throwable, JsonMappingException, IOException
	{
		String[]email= {"aish@gmail","aish@tyss"};
		Spouse sp=new Spouse("xyz","qwe",1234,23456);
		Spouse2 sp2=new Spouse2("abc","ty234",123,34567);
		EmployeeDetailsWithObject edwo=new EmployeeDetailsWithObject("aish", "ty123", "ballari", sp,sp2,email );
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./EmployeewithObject.json"), edwo);
		
	}

}
