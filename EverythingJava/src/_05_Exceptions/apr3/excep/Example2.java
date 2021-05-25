package _05_Exceptions.apr3.excep;
import java.util.Scanner;
public class Example2 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int ar[]= {12,34,56,67};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index: ");
		int in=sc.nextInt();
		
		System.out.println(in+" index value is: "+ar[in]);
		//if index not in the range, it throws ArrayIndexOutOFBoundsException:
		System.out.println("thank you");
		System.out.println("main method end");
	}
}
