package _05_Exceptions.apr3.handling;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value");
		int a = sc.nextInt();
		System.out.println("enter the second value");
		int b = sc.nextInt();
		try {
			int q = a / b; // if b is zero, it throws ArithmeticException
			System.out.println("quotent is " + q);
		} catch (ArithmeticException ae) {
			System.out.println("b must not be zero");
		}
		System.out.println("thank you");
		System.out.println("main method end");

	}
}
