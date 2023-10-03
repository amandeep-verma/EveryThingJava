package _02_OOPS.mar20;
//Class Rectangle2 is inherited using class Shape2.  Method getArea is overridden.
public class Rectangle2  extends Shape2{
	double l;
	double b;
	Rectangle2(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	double getArea()
	{
		return (l*b);
	}
}
