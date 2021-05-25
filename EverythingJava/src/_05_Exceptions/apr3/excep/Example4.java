package _05_Exceptions.apr3.excep;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1. dog, 2. cat");
		int choice=sc.nextInt();
		Animal a=null;
		switch(choice){
		case 1: a=new Dog();
				break;
		case 2: a=new Cat();
				break;
		default:	 break;
			
		}
		Dog d=(Dog)a; // if a is not a Dog, it throws ClassCastException:
		System.out.println("thank you");
		System.out.println("main method end");
	}

}
