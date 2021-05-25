package _05_Exceptions.apr4;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = null;
		if (sc != null)
			sc.close();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter your name ");
		String name = sc1.nextLine();

//		sc1.close();

		System.out.println("enter your age ");

		try {
			double age = sc1.nextDouble();
			sc1.close();
			System.out.println("hello..");
		} catch (Exception e) {
			System.out.println("Age is not a double type");
		}
		
		System.out.println("end of program ...");
	}

}
