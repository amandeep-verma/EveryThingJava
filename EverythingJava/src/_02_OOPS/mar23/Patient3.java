package _02_OOPS.mar23;
// class Patient3 extends Person3 and adds 2 more abstract method 
public abstract class Patient3 extends Person3{
	int pid;
	double bill;
	public Patient3(String name, int age, int pid, double bill) {
		super(name, age);
		this.pid = pid;
		this.bill = bill;
	}
	abstract int getpid();
	abstract double getbill();
}
