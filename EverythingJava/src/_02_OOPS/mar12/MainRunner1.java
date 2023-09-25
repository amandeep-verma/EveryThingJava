package _02_OOPS.mar12;
// Inheritance
//printing the variable and calling the methods of parent class using child class reference
public class MainRunner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 s1=new Shape1();
		System.out.println(s1.pi);
		System.out.println("-----------------");
		Circle1 c1=new Circle1();
		System.out.println(c1.pi);
		System.out.println(c1.r);
		c1.shapeinfo();
		c1.dispArea();

	}

}
