package _02_OOPS.mar21.xyz;
// class Test2 extending class Test1 with method print overloaded with one variable.
public class Test2 extends Test1{
	int x=500;
	void print(String a)  // overloading
	{
		System.out.println("i am printing test2");
		System.out.println("i am x "+x);
	}
}
