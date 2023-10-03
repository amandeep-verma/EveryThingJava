package _02_OOPS.mar23;
// class Ptype implements all abstract method
public class Ptype3 extends Patient3{
	String type;
	public Ptype3(String name, int age, int pid, double bill, String type) 
	{
		super(name, age, pid, bill);
		this.type = type;
	}
	String getName()
	{
		return name;
	}
	int getAge() {
		return age;
	}
	int getpid()
	{
		return pid;
	}
	double getbill()
	{
		return bill;
	}
	String gettype()
	{
		return type;
	}
}
