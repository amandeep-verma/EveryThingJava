package _02_OOPS.mar20;
// object of class created using the upcasting. Upon calling the overriden methods, it calls the method 
// implementation in child class

public class MainRunner1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1("rajesh", 23, 123, 67.55);
		s1.PersonInfo();
		System.out.println("--------");
		Person1 p1 = new Student1("sam", 21, 124, 75.55); // upcasting
		p1.PersonInfo();
		System.out.println("--------");
		Person1 p2 = new Person1("rahul", 21);
		p2.PersonInfo();

	}
}
