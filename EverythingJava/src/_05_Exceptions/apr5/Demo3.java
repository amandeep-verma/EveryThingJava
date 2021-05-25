package _05_Exceptions.apr5;
// throw can be used in combination with try and catch. We can pass the String in an exception in throw so it can 
// print it on the screen
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		try {
			int n = sc.nextInt();
			if (n % 2 == 0)
				throw new NullPointerException("even number"); // pass the string in any exception to print the string
			else
				throw new ArithmeticException("odd number");
		} 
		catch (Exception e)  // if value other than number is entered, ie- String
		{
			System.out.println(e.getMessage());
		}
		System.out.println("thanku ...");
		
	}
}
