package _02_OOPS.mar22;
// final static variables needs to be initialized at the time of declaration or in a static block in the same class
public class Simple3 {

	final static int c = 100;
	final static int d;

	static int e;

	Simple3() {
		// d=40; // error can't initialized in non-static block
		e = 10;
	}

	void disp() {
		// d=40; // error can't initialized in a method as it is final (even if method is static)
		e = 9;
	}

	static {
		d = 20;
		e = 11;
	}

	void print() {
		System.out.println("here is final value " + d);
	}
}