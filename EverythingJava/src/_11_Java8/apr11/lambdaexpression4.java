package _11_Java8.apr11;
// Types of interface
// 1. Normal - more than 1 method
// 2. Single abstract method (Functional Interface)- only 1 method
// 3. Marker interface - have no method - example - Serializable

// Lambda Expression comes from Scala from Java 1.8

// For a functional interface which have only one method, when we have to define the object. 
// why should we explicitly mention the name of the method to be overriden. So that is where Lambda Expression
// comes in. Since we have only one method in the interface, it is understood by itself which method is being overriden.

@FunctionalInterface
interface quantum
{
	void show();
}

public class lambdaexpression4 {

	public static void main(String[] args) {

		// Lambda expression syntax
		quantum a = () ->
		{
			System.out.println("Its me the lambdaexpression");
		};
		a.show();
	}
}
