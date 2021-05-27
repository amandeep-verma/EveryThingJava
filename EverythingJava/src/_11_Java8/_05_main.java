package _11_Java8;

import java.util.Arrays;
import java.util.List;

//V22-23  Telusko 
// Comapring the 2 styles of programming

public class _05_main {

	public static boolean isDivisible(int i)
	{
		System.out.println("isDivisible "+i);
		return i%5==0;
	}

	public static int mapdouble(int i)
	{
		System.out.println("mapdouble "+i);
		return i*2;
	}

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12,20,35,46,60,68,75);

		// The two ways to find first number is list divisible by 5 and multiply it by 2 are- 

		// Imperative programming
		int result =0;
		for(int i:values)
		{
			if(i%5==0)
			{
				result=i*2;
				break;
			}
		}
		System.out.println(result);

		// Declarative Programming
		System.out.println(values.stream().filter((t) -> t%5==0).map(i->i*2).findFirst().orElse(0));


		/* One may argue that imperative is better since it need not to process the whole array. But the fact is
		 even stream does not process the whole array before printing the result. 
		 As we know map and filter are lazy methods they process the whole stream but findFirst is terminating method.
		 It terminates straight after processing the result. Proof can be seen below
		 */


		System.out.println(values.stream().filter(_05_main::isDivisible).map(_05_main::mapdouble).findFirst().orElse(0));
		/* filter(_05_main::isDivisible) - means you are implementing the test method in Predictable interface to call 
		 isDivisible method and passing its object to filter method.
		 map(_05_main::mapdouble) - means you are implementing the apply method in Function interface to call the 
		 mapdouble method passing its object to map method.
		 Both mapdouble & isDivisible prints the values being passed to depict that whole stream will not be processed
		 if terminating function gets the object it need.
		 */
	}

}
