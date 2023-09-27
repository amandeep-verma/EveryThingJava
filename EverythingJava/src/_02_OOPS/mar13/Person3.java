package _02_OOPS.mar13;
// class Person only with 1 constructor which has 2 parameters
public class Person3 {
	String name;
	int age;
	Person3(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void PersonInfo()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
	}
}
