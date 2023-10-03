package _02_OOPS.mar27;
// class Sample0 implements Simple0 interface. Also it implements the method m1.
// the abstract method from interface when implemented in child class have to declared public explicitly

public class Sample0 implements Simple0{
	// since method m1 is public in interface, we have to explicitly make it public
	public void m1()
	{
		System.out.println("m1 method is implemented in Sample");
		
	}
	void m2()
	{
		System.out.println("i am m2 in Sample");	
	}
}
