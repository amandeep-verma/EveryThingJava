package _11_Java8;

//V19-21  Telusko 

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _04_main {
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12,20,35,46,60,68,75);
		
//		Imperative Programming
		int result =0;
		for(int i:values)
		{
			if(i%5==0)
				result+=i;
		}
		
		System.out.println(result);
		
		
//		Declarative Programming
		// filter() takes 1 parametre of type Predicate interface object.
		// Predicate is functional interface with test method unimplemented with return type boolean
		System.out.println(values.stream().filter((t) -> t%5==0).reduce(0,(c,e)->c+e));
		
		
		// We can also add map after filter to multiply each number by 2
		System.out.println(values.stream().filter((t) -> t%5==0).map(i->i*2).reduce(0,(c,e)->c+e));
		
		// Now instead of reduce, we can use findFirst() whose return type is Optional
		// findFirst which will output the first object in the stream, if there isn't any than it will output 
		// Optional.empty
		System.out.println(values.stream().filter((t) -> t%5==0).map(i->i*2).findFirst());
		System.out.println(values.stream().filter((t) -> t%11==0).map(i->i*2).findFirst());
		
		// You can also add another method orElse which will produce the output if there isn't any. 
		System.out.println(values.stream().filter((t) -> t%11==0).map(i->i*2).findFirst().orElse(0));
	}
}
