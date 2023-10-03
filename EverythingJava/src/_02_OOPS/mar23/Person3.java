package _02_OOPS.mar23;
// class Person3 contains abstract methods
public abstract class Person3 {
	String name;
	int age;
	public Person3(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	abstract String getName();
	abstract int getAge();
	
}
