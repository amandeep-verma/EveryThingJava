package _02_OOPS.mar13;
// In child class Student, the constructor by default calls the no parameterized constructor of parent class
// But since parent class does not have no parameterized constructor 
public class Student3 extends Person3{
	int Sid;
	double  Sper;
	Student3(String name, int age,int Sid,double Sper) {
		super(name, age);
		this.Sid=Sid;
		this.Sper=Sper;
	}
	void stdInfo()
	{
		PersonInfo();
		System.out.println("Id: "+Sid);
		System.out.println("Sper "+Sper);
	}

}
