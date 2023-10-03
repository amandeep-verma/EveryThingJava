package _02_OOPS.mar20;
// Parameterized constructor from parent class called using super keyword. Method PersonInfo is overriden.
public class Student1 extends Person1{
	int Sid;
	double Sper;
	Student1(String name,int age,int Sid,double Sper)
	{
		super(name,age);
		this.Sid=Sid;
		this.Sper=Sper;
	}
	void PersonInfo()
	{
		super.PersonInfo();
		System.out.println("Sid "+Sid);
		System.out.println("Sper "+Sper);
	}
	
}
