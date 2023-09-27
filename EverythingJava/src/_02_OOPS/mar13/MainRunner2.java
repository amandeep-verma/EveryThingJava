package _02_OOPS.mar13;
// By default no parameterized constructor of parent class is present in all constructors of child class.
public class MainRunner2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Test2 t1=new Test2();
		System.out.println("--------------------");
		Test2 t2=new Test2(10);

	}

}
