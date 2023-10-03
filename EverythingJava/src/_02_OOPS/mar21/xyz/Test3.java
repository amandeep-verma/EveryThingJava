package _02_OOPS.mar21.xyz;
//class Test3 extending class Test2 with method print overloaded with two variable and overridden 
// with no variable.
public class Test3 extends Test2{
	int x=5000;
	void print() // overriding
	{
		System.out.println("i am printing test3");
		System.out.println("i am x "+x); 
		
	}
	void print(double a,double b) // overloading
	{
		System.out.println("print(a,b) printing test3");
	}
}
