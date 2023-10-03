package _02_OOPS.mar20;
//Class Square2 is inherited using class Shape2.  Method getArea is overridden.
public class Square2  extends Shape2{
	double s;
	Square2(double s)
	{
		this.s=s;
	}
	
	double getArea()
	{
		return s*s;
	}
	
	String test()
	{
		return "hello";
	}
}
