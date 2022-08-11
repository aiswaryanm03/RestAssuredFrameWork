package GenericLibrary;

import io.restassured.response.Response;

/**
 * this class contains rest assured specific reusable methods
 */
public class RestAssuredLibrary {
	
	/**
	 * this method will get jsondata from jsonPath in response body
	 * @param response
	 * @param path
	 * @return
	 */
	public String getJsonData(Response response ,String path)
	{
		String jsonData=response.jsonPath().get(path);
		return jsonData;
		
	}

}
