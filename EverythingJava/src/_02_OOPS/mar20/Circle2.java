package _02_OOPS.mar20;
//Class Cirle2 is inherited using class Shape2.  Method getArea is overridden.
public class Circle2 extends Shape2{
	double rad;
	Circle2(double rad)
	{
		this.rad=rad;
	}
	double getArea()
	{
		return (pi*rad*rad);
	}
	

}
