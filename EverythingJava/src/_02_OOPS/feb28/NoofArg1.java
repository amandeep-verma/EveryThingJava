package _02_OOPS.feb28;

/* 
OOP (Object Oriented Programming) are Polymorphism, Inheritance, Abstraction  and Encapsulation
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
