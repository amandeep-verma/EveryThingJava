package _05_Exceptions.apr4;

import java.util.Scanner;

public class ExceptionDemo3 {
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
		catch (Throwable e)  // throwable is superclass of Exception
		{
			System.out.println(e); // it prints exception name with the message 
			System.out.println(e.getMessage());   // it prints just the message 
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
