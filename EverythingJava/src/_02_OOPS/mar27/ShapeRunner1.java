package _02_OOPS.mar27;
// static methods of interface can be called using ClassName.
// MainClass makes the object of interface using the class(selected by user), checks for the instance it belongs to
// and print the properties.


/*
From Stream API(came in java8). For List interface(came in Java 1.2), there came new methods in java8 related to StreamApi
and others. Now for a software build on earlier java version when you use it on Java8, the class extending the old interface 
will only have implementation of old methods not the new one(which contains new methods). This would cause huge problems. 
Now instead of developer to implement all the method for the updated interface, Java8 came with feature of allowing implementing 
a method inside a interface itself. So you can update the interface without worrying about the implementing class errors.
*/
import java.util.Scanner;
public class ShapeRunner1 {

	public static void main(String[] args) {
		
		Shape1.hello(); // we can only call static method in interface by class name 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Circle , 2. Square , 3. Rectangle");
		int n=sc.nextInt();
		Shape1 sh=null;
		switch(n)
		{
			case 1: sh=new Circle1(3.5);
			break;
			case 2: sh=new Square1(5.3);
			break;
			case 3: sh=new Rectangle1(4,6);
			break;
			default: System.out.println("enter the right number  ");
			return;
		}
		
		// sh can be passed as parameter in a method of class as reference of interface Shape1
		// (irrespective of which  ever class object it is)
		Colorit1 c  = new Colorit1();
		c.colorMe(sh);
		
		
		if(sh instanceof Circle1) // instaceof returns true if object to it is instance of the class mentioned
		{
			System.out.println("circle:");
			Circle1 C=(Circle1)sh;
			System.out.println("radius is "+C.r);
		}
		else if(sh instanceof  Square1)
		{
			System.out.println("Square");
			Square1 s=(Square1)sh;
			System.out.println("side is "+s.s);
		}
		else
		{
			System.out.println("Rectangle");
			Rectangle1 R=(Rectangle1)sh;
			System.out.println("lenght "+R.l+" & breadth "+R.b);
		}
		System.out.println("Area is "+sh.getArea());
		
		
	}

}
