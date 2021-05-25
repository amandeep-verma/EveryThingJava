package _05_Exceptions.apr6;
/* Here an argument is being passed to a method and method throws the exception on certain conditions. When 
 * method throws exception instead of using try and catch block , we have to mention method next to method name.
 * The runtime/unchecked exception are not required to be mentioned next to method. 
 * 
 * Also in main method when we pass check(20) without try and catch bloc, it have to be either inside try and catch
 * else we have to throw the exception to JVM to handle
*/

import java.io.IOException;
import java.sql.SQLException;

public class main1 {

	static void check(int a) throws IOException, SQLException
	{
//		there is no need to throw NullPointerException next to method as it is runtime/unchecked exception
		if(a%2==0)
			throw new NullPointerException("divisble by 2");
//		below both are checked exception thats why we throw them on top at the time of declaration of the method
		if(a%5==0)
			throw new SQLException("divisible by 5");
		if(a%3==0)
			throw new IOException("divisble by 3");
	}
	
	public static void main(String[] args) throws Exception {
		try {
			check(21);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		check(20); // here 21 is also checked exception but we are throwing it to JVM
	}

}
