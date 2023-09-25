package _02_OOPS.mar12;

// Circle class extending shape class and using the pi inherted value
public class Circle1 extends Shape1 {
	double r = 5.6;

	void dispArea() {
		System.out.println("area is " + pi * r * r);
	}
}
