package _02_OOPS.mar13;
// parent class with only one constructor which is parameterized so have to explicitly call the constructor in 
// child class.
public class Customer4 extends Person4{

	long id;
	double bill;
	Customer4(String name,int age,long id,double bill) 
	{
		super(name,age);
		this.id=id;
		this.bill=bill;
	}
	void CusInfo() 
	{
		PersonInfo();
		System.out.println("id "+id);
		System.out.println("bill "+bill);
	}
	

}
