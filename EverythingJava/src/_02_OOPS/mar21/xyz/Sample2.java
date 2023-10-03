package _02_OOPS.mar21.xyz;
// class sample2 extends simple2, private variables and method from parent class can't be accessed.
public class Sample2 extends Simple2{
	
	void m1() // m1 is not over ridden here, as m1 in Simple2 is private.
	{
		System.out.println("anything can happen");
	}
	
	void disp()
	{
		// System.out.println(a);  //private
		// m1();                   //private
		System.out.println(b);
		m2();
		System.out.println(c);
		m3();
		
	}
}
