package _02_OOPS.mar12;
// pen class with default values for color and price.
public class Pen3 {
	String company;
	String color = "red";
	Double price = 33.1;

	void Info() {
		System.out.println("company " + company);
		System.out.println("color " + color);
		System.out.println("price " + price);
	}
}
