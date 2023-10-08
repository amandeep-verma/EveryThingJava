package _11_Java8.apr11;

// Abstract class - Define and declare the method
// Interface - only define the methods (1.7)

// Interface - we can both define and declare the methods (1.8)
// So there is not much difference between abstract class and interface, but given a choice go with interface. 

// So now the functional interface definition is- It is an interface with only 1 abstract method
// Interface Demo is functional interface since it has only one abstract method
interface Demo
{
	void abc();
	// to define the method its return type have to be default or it needs to be static.
	default void show()
	{
		System.out.println("in show");
	}
}

class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("abc in class DemoImp");
	}
}

public class Interface5 {

	public static void main(String[] args) {
		
		// by making object of interface in child class
		Demo obj = new DemoImp();
		obj.show();
		obj.abc();
		
		
		// by lamba expression
		Demo dm = () ->{
			System.out.println("abc method from lamba expression");
		};
		
		dm.abc();

	}

}
