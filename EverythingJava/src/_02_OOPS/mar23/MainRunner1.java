package _02_OOPS.mar23;
// We can't create object for abstract class
// the parent class being abstract can make an object in child class if child class isn't abstract
public class MainRunner1 {
	public static void main(String[] args)
	{
//		Shape s= new Shape(); // abstract class , can't be initiated 
		Shape1 sh=new Circle1("red",4); // upcasting
		System.out.println(sh.getArea()+" "+sh.getColor());
	}

}
