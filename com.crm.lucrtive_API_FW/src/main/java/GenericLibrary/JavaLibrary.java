package GenericLibrary;

import java.util.Random;

/*
 * this class contains all java specific generic methods
 */
public class JavaLibrary {
	/*
	 * this method will generate random number for every execution
	 */
	public int RandomNumber()
	{
		Random ran=new Random();
		return ran.nextInt(1000);
	}
	

}
