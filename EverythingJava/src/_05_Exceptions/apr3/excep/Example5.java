package _05_Exceptions.apr3.excep;

public class Example5 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int ar[]= new int[2147483647]; // requested array exceeds VM limit
		//int ar[]= new int[21474836493]; //it gives out of OutofMemoryError:
		System.out.println("main method end");
	}
}
