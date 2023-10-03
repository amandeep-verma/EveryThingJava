package _02_OOPS.mar27;
// in interface all variables are public static final by default and all methods are public abstract void.

//from java8 you can define non abstract method in interface but you can't call it by object reference
// and you can't use the method 

public interface Shape1 {
	public  int a=5;
	
	double getArea(); // abstract method
	
	// from java8 you can define non abstract method in 2 ways
	// 1. static
	// 2. non-static, should be default
	
	
	static void hello() 
	{
		System.out.println("i am static method in interface ");
	}
	
}