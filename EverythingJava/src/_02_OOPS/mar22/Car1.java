package _02_OOPS.mar22;
// static final variables need to be defined at the time of declaration or in a static block in the same class
// start is final method
public class Car1 {
	
	Car1()
	{
		System.out.println("hell");
	}
	  
	static final int a;
	int b=3;
	static {
		a=5;
	}
	
	final void Start()
	{
		System.out.println("car starts");
	}
	
}
