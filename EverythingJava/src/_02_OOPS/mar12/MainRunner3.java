package _02_OOPS.mar12;
// Super class Pen can make object using child class reference. It will only have properties of super class but it 
// will reserve memory for subclass properties.
public class MainRunner3 {

	public static void main(String[] args) {

		Pen3 p1 = new MarkerPen3(); // UPCASTING
		p1.Info();
		p1.company = "reynolds"; 
		System.out.println("-------------");
		p1.Info();
		System.out.println("-------------");
		MarkerPen3 m1 = new MarkerPen3();
		m1.DispInfo();
	}
}
