package _02_OOPS.mar12;
// how a extended variable can be accessed if there are variable in extending class with same name. 

public class Sample2 extends Simple2{
	int x=60;
	void print()
	{
		int x=90;
		System.out.println("I am print method of Sample");
		display();
		System.out.println("x local value is : "+x); // method variable
		System.out.println("x current value is : "+this.x); // this keyword for global variable in this class
		System.out.println("x super class value is : "+super.x); // super keyword for parent class variable
		System.out.println("y value is : "+y);
	}

}
