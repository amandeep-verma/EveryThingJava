package _02_OOPS.mar20;
// class b0 extending class a0, overriding the method disp().
public class B0 extends A0{
	String name = "Class B";
	int number=20;
	
	
	public void disp()
	{
		System.out.println("class B");
		System.out.println(name);
		System.out.println(number);
	}
	
	
	
	int checkpoint;
	
	public void test()
	{
		System.out.println("the new method");
	}
	
}
