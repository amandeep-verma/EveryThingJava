package _02_OOPS.mar21.xyz;
// class simple show-casing access control modifiers for variables and methods
public class Simple2 {
	private int a=20;
	int b=40;
	protected int c=50;
	public int d=60;
	private void m1()
	{
		System.out.println(a);
	}
	void m2()
	{
		m1();
		System.out.println(b);
	}
	protected static void m3()
	{
		System.out.println("c");
	}
	public void m4()
	{
		a=a+5;
		System.out.println("this is "+a);
		System.out.println(d);
	}
}
