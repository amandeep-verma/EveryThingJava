package _02_OOPS.mar27;
// Class Circle1 implements method getArea.
public class Circle1 implements Shape1{
	double r;
	Circle1(double r)
	{
		this.r=r;
	}
	public double getArea()
	{
		return 3.14*r*r;
	}

}
