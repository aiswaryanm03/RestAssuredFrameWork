package DifferentWaysToPost;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTesting.POJOForDDT;
import GenericLibrary.ExcelUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateMultipleProject {
	@Test(dataProvider = "data")
	public void createMultipleProject(String createdBy, String projectName, String status, int teamSize)
	{
		baseURI="http://localhost:8084";
		Random ran=new Random();
		int random=ran.nextInt(400);
		POJOForDDT ddt=new POJOForDDT(createdBy, projectName+random, status, teamSize);
		given().body(ddt).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
	}
		
		@DataProvider(name="data")
		public Object[][] data() throws Throwable
		{
			Object [][] Testdata=new Object[3][4];
			ExcelUtility elib=new ExcelUtility();
			int m=0;
			for(int i=0;i<=2;i++)
			{
				int n=1;
				for(int j=0;j<=3;j++)
				{
					Testdata[i][j]=elib.getDataFromExcel("sheet1", m, n);
					n++;
				}
				m++;
			}
			return Testdata;
			
//			data[0][0]="Aishu";
//			data[0][1] = "Dell";
//			data[0][2] = "Completed";
//			data[0][3] = 12;
//			
//			data[1][0] = "Vijay";
//			data[1][1] = "HP";
//			data[1][2] = "Created";
//			data[1][3] = 15;
//			
//			data[2][0] = "Pavan";
//			data[2][1] = "TYSS";
//			data[2][2] = "On Going";
//			data[2][3] = 20;
//			return data;
//			
//	
		
		
	}

}
