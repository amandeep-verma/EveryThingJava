package _02_OOPS.mar27;

public class Rectangle1 implements Shape1{
	double l;
	double b;
	Rectangle1(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public double getArea()
	{
		return (l*b);
	}
}
