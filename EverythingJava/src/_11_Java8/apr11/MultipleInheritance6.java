package _11_Java8.apr11;
// Now when we can both declare and define a method inside an interface and a class can implement multiple 
// interface, 2 interface with same method names implemented by a class would cause ambiguity problem.
// It can be resolved by 2 ways
// 1. Over riding the method in the implementing class with your own implementation
// 2. You can over ride  with default method already defined from either of interface using InterfaceName.super.MethodName


/*
From Stream API(came in java8). For List interface(came in Java 1.2), there came new methods in java8 related to StreamApi
and others. Now for a software build on earlier java version when you use it on Java8, the class extending the old interface 
will only have implementation of old methods not the new one(which contains new methods). This would cause huge problems. 
Now instead for developer to implement all the method for the updated interface, Java8 came with feature of allowing implementing 
a method inside a interface itself. So you can update the interface without worrying about the implementing class errors.
*/


// animal is still a functional interface
interface animal {
	void abc();

	// From Java 1.8 you can define a method in interface but it have to be either default or static type.
	default void show() {
		System.out.println("in animal");
	}
}

interface human {
	default void show() {
		System.out.println("in human");
	}
}

// if you are implementing 2 interface with same method name you have to over ride it, otherwise there is no need.
class Cat implements animal, human {
	public void abc() {
		System.out.println("in Cat");
	}

	public void show() {
		// Either of below 2 ways can be used.
		System.out.println("Over riden show from Cat");
		animal.super.show();
	}
}

public class MultipleInheritance6 {

	public static void main(String[] args) {
		animal a = new Cat();
		a.abc();
		a.show();	
	}
}
