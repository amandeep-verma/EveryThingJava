package _02_OOPS.mar27;

public class Colorit1 {
	// We can pass the interface reference in the method (without caring to which class it is object to.)
	public void colorMe(Shape1 sh)
	{
		System.out.println(sh.getClass()+" is the getting colored");
	}
}
