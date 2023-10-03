package _02_OOPS.mar22;
// a final non-static variable has to be defined at the time of declaration or in a non-static block.
public class Sample2 {
	
	final int a=10;
	final int b;
	final int c;
	
	Sample2()
	{
//		a=90; // error as a is final , once declared can't be declared again
		b=20;
	}
	
	void disp()
	{
//		c=11; // c cant be assigned in a method as it is final (even if method is static(static members are loaded 
		// at the time of class loading even before creating the object for the class ))
	}
	
	{ // non static block
		
		c=11; // can be given a value as it is in a non static block
	}
	
}
