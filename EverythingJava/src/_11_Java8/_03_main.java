package _11_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

//V14-17  Telusko 

public class _03_main {
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		
		// Now to double the values in list and produce sum, we can
		int result = 0;
		for(int i:values)
		{
			result = result +i*2;
		}
		System.out.println(result);

		//adding to a variable each time, causes a lot of mutations which doesn't lets you achieve concurrency
		// How to achieve concurrency, without doing mutation? - Using Stream
		
		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
		//Lets break it down.
		
		// values.stream() returns object type of stream;
		Stream s = values.stream();
		
		// map() takes object of Function interface as a parameter
		// Function is functional interface with apply as unimplemented method. It takes 2 parameter as in for input 
		// and return type while defining Function. 
		// Here we implement the apply() with 1 parametre to return the double of value of every passed integer.
		// anonymous class
		Function<Integer, Integer> f = new Function<Integer, Integer>()
		{
			public Integer apply(Integer i) {
				return i*2;
			}
		};
		
		Stream s1 = values.stream().map(f);
		
		
		// using anonymous class
		Stream s2 = values.stream().map(new Function<Integer, Integer>()
		{
			public Integer apply(Integer i) {
				
				return i*2;
			}
		});
		
		// Using lambda expression
		Stream s3 = values.stream().map((Function<Integer, Integer>)(i)->
		{
				return i*2;
		});
		
		// further reducing
		Stream s4 = values.stream().map((Function<Integer, Integer>)(i)-> i*2 );
		
		// Defining the Stream type to be Integer so we dont have to mention it in lambda function
		Stream<Integer> s5 = values.stream().map( i-> i*2 );
		
		
		
		// reduce() takes 2 values as as parametre, 1st inital object value, 2nd BinaryOperator object
		// BinaryOperator is functional interface with apply as unimplemented method. It takes one paramter of input type,
		// whiel defininng BinaryOperator.
		// apply() takes 2 parametre, 1 is the initial value which comes from reduce() and other is each object in stream
		// using which we compute and return it. c= carry, e v= value
		// anonymous class
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			public Integer apply(Integer c, Integer e) {
				return c+e;
			}
		};
		
		
		Integer result1 =(Integer) s1.reduce(0,b);
		System.out.println(result1);
		
		// Using lambda expression
		Integer result4 = (Integer) s4.reduce(0, (BinaryOperator<Integer>)(c,e)-> c+e);
		System.out.println(result4);
		
		// Since stream type s5 is defined as Integer,  we dont have to mention it in lambda function
		Integer result5 = s5.reduce(0,(c,e)-> c+e);
		System.out.println(result5);
		
		
		// So everything can be reduced down to 1 line 
		Integer res = values.stream().map(i -> i * 2).reduce(0,(c, e) -> c + e);
		System.out.println(res);
	}
}
