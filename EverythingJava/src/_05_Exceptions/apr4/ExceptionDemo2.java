package _05_Exceptions.apr4;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner sc = null;
		if (sc != null)
			sc.close();

		sc = new Scanner(System.in);
		System.out.println("enter your name ");
		String name = sc.nextLine();

		//sc.close();

		System.out.println("enter your age ");
		try {
			double age = sc.nextDouble();
			//sc.close();
			System.out.println("read two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();;
			int c=a/b;
			sc.close();
			System.out.println("hello..");
		} 
		catch (ArithmeticException e)
		{
			System.out.println(e); // prints exception name with the message 
			System.out.println(e.getMessage());  // it prints just the message 
			System.out.println("its an issue with 0");
			System.out.println("--------");
			e.printStackTrace();  // prints the exception class with message with all the details (full exception message)
		}
		catch (Exception e) 
		{
			e.printStackTrace(); // it prints the exception class with message with all the details (full exception message)
		}
		finally
		{
			System.out.println("finally...");
			if(sc!=null)
			{
				sc.close();
			}
			System.out.println();
		}

		System.out.println("end of program..");
	}

}
