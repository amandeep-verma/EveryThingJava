package _11_Java8.apr11;

// anonymous class is used when we have to create a child class for only over-riding a method 
// for a very limited time.
// Instead of writing the child class, we can just write a anonymous class in main.

public class anonymousClass1 {

	public static void main(String[] args) {
		
		// Making object of class print1 and invoking method printing
		print1 P = new print1();
		P.Printing();

		// Making anonyous class from print1 class and over riding method printing. Its scope is only for this object.
		print1 PW = new print1() 
		{
			void Printing() 
			{
				System.out.println("from the anonymous class");
			}
		};
		
		PW.Printing();
	}

}
