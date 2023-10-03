package _02_OOPS.mar20;

// MainClass asks user for the input to make object of Super class using Child class reference (Upcasting)
// using switch statements.

import java.util.Scanner;

public class MainRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape2 sh = null;
		System.out.println("\n1-square ,2-circle,3- rectangle");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			sh = new Square2(8.9);
			break;
		case 2:
			sh = new Circle2(8.5);
			break;
		case 3:
			sh = new Rectangle2(3, 5);
			break;
		default:
			sh = new Shape2();
		}

		System.out.println(sh.getArea());

		Square2 b = (Square2) sh; // downcasting
	}
}
