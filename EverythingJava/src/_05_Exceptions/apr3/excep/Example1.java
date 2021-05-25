package _05_Exceptions.apr3.excep;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value");
		int a=sc.nextInt();
		System.out.println("enter the second value");
		int b=sc.nextInt();
		int q=a/b; //if b is zero, it throws ArithmaticException
		System.out.println("thank you");
		System.out.println("quotent is "+q);
		
	}
}
