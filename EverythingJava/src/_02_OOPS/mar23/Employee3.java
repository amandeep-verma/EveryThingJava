package _02_OOPS.mar23;
// class Employee3 extends Person3 and adds 2 more abstract method 

public abstract class Employee3 extends Person3{
	int eid;
	double sal;
	public Employee3(String name,int age,int eid,double sal) 
	{
		super(name, age);
		this.eid=eid;
		this.sal=sal;
	}
	abstract int geteid();
	abstract double getsal();
}
