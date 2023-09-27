package _02_OOPS.mar13;
// constructor of parent class is called inside the child class constructor even before child class constructor 
// when we create an object of child class. 
public class MainRunner1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Parent1 xy=new Parent1(5);
		System.out.println("-----------");
		Child1 c1=new Child1(3);
		
	}

}
