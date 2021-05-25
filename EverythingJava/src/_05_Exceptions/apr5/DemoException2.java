package _05_Exceptions.apr5;
import java.util.Scanner;
// Like the try catch blocks, we can throw exception with keyword throw.
public class DemoException2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		
		if(age<18)
		{
			// since arithmetic exception is runtime exception(unchecked) we don't have to mention it again next to method
			throw new ArithmeticException(); // you can throw user defined manual exception like this
		}
		
		System.out.println("eligible to vote ");
		System.out.println("thanku ... ");
	}
}
