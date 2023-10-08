package _11_Java8.apr11;
// Inner classes are the classes which defined inside a class
// Check main class for how to make the object of the inner classes.

class Outer{
	int a;
	static String name;
	void print()
	{
		System.out.println("Outer class| int= "+a +" String= "+name);
	}
	
	
//	None of the method inside a non static Inner class can be declared as static
//	A variable can be declared static only with final keyword inside a non static Inner class or class can be declared as static
	class Inner1{
		static final int a=9;;
		String name;
		void print()
		{
			System.out.println("Inner1 class| int= "+a +" String= "+name);
		}
	}
	
	static class Inner2{
		static int a;
		static String name;
		static void print()
		{
			System.out.println("Inner2 class| int= "+ a +" String= "+name);
		}
	}
}

public class InnerOuterClasses3 {
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.a = 5;
		obj.name ="outer class";
		obj.print();
		System.out.println("------------------------------");
		
		Outer.Inner1 objInner1 = obj.new Inner1();
//		objInner1.a =15;
		objInner1.name ="inner1 class";
		objInner1.print();
		System.out.println("------------------------------");
		
		obj.new Inner1().print();
		System.out.println("------------------------------");
		
		Outer.Inner2 objInner2 = new Outer.Inner2();
		objInner2.a=115;
		objInner2.name= "inner2 class";
		objInner2.print();	
		System.out.println("------------------------------");
		
		
		new Outer.Inner2().print();
		
		
	}
}
