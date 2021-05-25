package _05_Exceptions.apr3.handling;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int ar[] = { 12, 34, 0, 56, 67 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index: ");
		int in = sc.nextInt();
		try {
			System.out.println(in + " index value is: " + ar[in]);
			int q = ar[1] / ar[in];
			System.out.println("quotent is " + q);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception catch blocks");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOFBoundsException occuring");
		}
		// if index not in the range, it throws ArrayIndexOutOFBoundsException:
		System.out.println("thank you");
		System.out.println("main method end");
	}
}
