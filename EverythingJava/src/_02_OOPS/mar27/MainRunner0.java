package _02_OOPS.mar27;

public class MainRunner0 {

	public static void main(String[] args) {
		System.out.println(Simple0.x);
		// We can't create the object of interface, but we can create object referring to it.
		Simple0 s1=new Sample0(); //up cast
		s1.m1();
		
		Sample0 s=(Sample0)s1; //down cast
		
		s.m2();
		s.m1();
	}
}
