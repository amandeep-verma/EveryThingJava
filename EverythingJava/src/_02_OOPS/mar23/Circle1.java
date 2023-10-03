package _02_OOPS.mar23;
// the abstract method getArea from inherited class is implemented

public class Circle1 extends Shape1{
	double r;
	Circle1(String color,double r)
	{
		this.color=color;
		this.r=r;
	}
	double getArea()
	{
		return 3.141*r*r;
	}
}
