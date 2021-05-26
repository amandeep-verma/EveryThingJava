package _11_Java8;
// V1-V12 Telusko 
// Consumer Interface and Lambda Expression and Method Reference

/* List extends Collection and Collection extends Iterable interface. List class is present from java 1.2 
 but forEach() came in java 1.8. forEach() is implemented in Iterable interface because otherwise all 
 implementing class would have to implement it. Which is why feature of defining the methods in the interface
 was adopted in java 1.8
*/

/*
 Consumer interface is functional interface with unimplemented method accept().
 Since forEach() is implemented in Iteratable Interface, all classes/interfaces implementing/extending it
 will have it. 
 forEach() accepts the consumer interface object as parametre and executes the accept() (which is 
 over riden by the programmer at time of making object of Consumer interface by implementing/ anonymous class 
 lambda expression/ Method reference) for all the iteratable elements.
 */


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class _01_main {
	
	public static void doubleit(int i)
	{
		System.out.println(i*2);
	}
	
	public static void main(String[] args) {


		List<Integer> a = Arrays.asList(1,2,3,4,5);

		// External Iterations - Below are 3 ways of external iteration

		for(int i =0; i< a.size();i++)
			System.out.println(a.get(i));

		for(int i:a)
			System.out.println(i);

		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
			System.out.println(it.next());


		// Internal Iterations - If there is a way within collection to iterate over the list.

		System.out.println("---------------------------------------------");
		//forEach() accepts Consumer interface(functional interface)

		a.forEach(i -> System.out.println(i));
		// Steps below expresses how the code shrinks down to this line
		

		//Using anonymous class
		Consumer<Integer> ccb = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};

		a.forEach(ccb);

		// Using lambda expression (can be shrinked to)
		Consumer<Integer> cc = (Integer i)->{
			System.out.println(i);
		};

		a.forEach(cc);

		// using anonymous class - since forEach accepts Consumer interface(functional interface)
		a.forEach(new Consumer<Integer> ()
		{
			public void accept(Integer i) {
				System.out.println(i);
			}

		});
		
		//using lambda expression (can be shrinked to)
		a.forEach((Integer i)->{
			System.out.println(i);
		});
		
		//Since we have only 1 type of parameter and 1 line of overridden method (can be shrinked to)
		a.forEach(  i->  System.out.println(i) );
		
		
		// Method reference - Call by method - passing method as reference
		// The statement goes on to pass the println method which belong to System.out.
		// Similarly a static, non-static method & constructor of a class can be referred using :: operator
		// This is similar to lambda expression but here you directly refer to method without implementing method 
		a.forEach(System.out::println);
		
		
		// double it is static method in the present class written by me
		// to double the every passing value - using lambda expression
		a.forEach(i-> doubleit(i));
		
		// the above one can be written as- ClassName::method, since method is static
		a.forEach(_01_main::doubleit);
		
		// This basically means you are overiding accept() to call doubleit().
		
	}
}
