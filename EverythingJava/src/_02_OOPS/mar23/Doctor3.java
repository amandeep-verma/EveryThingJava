package _02_OOPS.mar23;
// class Doctor3 implies all abstract method.

public class Doctor3 extends Employee3{
	String Dsg;
	public Doctor3(String name, int age, int eid, double sal, String Dsg) {
		super(name, age, eid, sal);
		this.Dsg = Dsg;
	}
	
	int geteid() {
		
		return eid;
	}
	double getsal() {
		
		return sal;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getDsg() {
		return Dsg;
	}
}
