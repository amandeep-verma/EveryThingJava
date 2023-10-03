package _02_OOPS.feb28;

/* 
OOP (Object Oriented Programming) are 
1. Polymorphism
2. Inheritance -  child class inherits the property of parent class by extends keyword
3. Abstraction - a process of hiding the implementation details from the user, only the functionality will be provided.
	By using abstract method/ abstract class(interface). 
4. Encapsulation -  wrapping the data (variables) and code acting on the data (methods) together as a single unit.
	Achieved by using getter and setters for variables and making variables private.


Polymorphism: is the ability of an object to take on many forms.
There are 2 types of polymorphism which are commonly mentioned.
1. Compile-Time Polymorphism/ Early binding/ Static binding : Method Overloading
2. Run-Time Polymorphism/ Late binding/ Dynamic binding: Method Overriding

 Method Overloading: having more than one method with the same method name but with different arguments 
 (return type may or may not be same)
 Three ways of achieving it:
 1. Different number of arguments
 2. Different type of data types
 3. Different sequence of arguments

*/
class NoofArg1
{
	
	static int add(int a,int b)
	{
		System.out.println("2 number");
		return a+b;
	}
	static int add(int x,int y,int z)
	{
		System.out.println("3 number");
		return x+y+z;
	}

	public static void main(String[] args)
	{
		System.out.println("Method Overloading by Different number of arguments \n");
		int s1=add(2,3);
		int s2=add(5,6,7);
		System.out.println(s1);
		System.out.println(s2);
	}
} 
