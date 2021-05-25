package _05_Exceptions.apr5;
// The exception occured in class Simple5 is handle here by try and catch blocks.
// Also instead of handling it with try and catch, we can have it thrown to JVM by simply using throws keyword like
// we did in Simple5 
import java.io.FileNotFoundException;

public class MainDemo5
{
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		String st="/Users/amandeepverma/Desktop/tolarn.txt";
		Simple5 s=new Simple5();
		try {
			s.open(st);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("Main Method end");
	}
}
