package _02_OOPS.mar27;
//Class Square1 implements method getArea.
public class Square1 implements Shape1{
	double s;
	Square1(double s)
	{
		this.s=s;
	}
	public double getArea()
	{
		return s*s;
	}
}
