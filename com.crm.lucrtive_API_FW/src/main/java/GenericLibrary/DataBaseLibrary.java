package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * this class is used to generic methods related to database
 * @author Lenovo
 *
 */
public class DataBaseLibrary {
	
	/**
	 * this methos is used to connect to database
	 */
	Driver driverref;
	Connection con;
	public void connectDB() throws SQLException
	{
		driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection(IConstants.dbURL,IConstants.dbUserName,IConstants.dbPassword);
		
	}
	/**
	 * this method is used to close the database
	 * @throws SQLException
	 */
	
	public void closeDB() throws SQLException
	{
		con.close();
		
	}
	
	/**
	 * this method will execute the query and return value if validation is pass
	 * @param Query
	 * @param expData
	 * @param colIndex
	 * @return
	 * @throws SQLException
	 */
	boolean flag=false;
	public String readDataFromDBAndValidate(String Query,String expData,int colIndex) throws SQLException
	{
		
		ResultSet result = con.createStatement().executeQuery(Query);
		while(result.next())
		{
			if(result.getString(colIndex).equals(expData))
			{
				flag=true;
				break;	
			}	
		}
		if(flag)
		{
			System.out.println("data verified");
			return expData;
		}
		else
		{
			System.out.println("not verified");
			return "";
		}
	}

}
