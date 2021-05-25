package _05_Exceptions.apr6;
/* since method validate isn't static we have to make the object of the class to access it. After passing the 
 * argument to the method, the method throws an exception which further have to mentioned next to the method it
 * is inside. The calling method(main method) instead of handling it by itself throws it to JVM so we again mention
 * it next to main method.
*/
public class Main2 {

	void validate(int age) throws InvalidAgeException
	{
		throw new InvalidAgeException("less than zero");
	}
	
	public static void main(String[] args) throws InvalidAgeException 
	{
		Main2 m = new Main2();
		m.validate(5);
		System.out.println(9/2);
	}

}