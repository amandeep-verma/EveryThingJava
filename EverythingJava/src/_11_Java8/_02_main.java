package _11_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//V13 Telusko 

/*
 Stream API has lots of method to process Huge amount of data (bigData, Hadoop)
 Stream operations are divided into intermediate and terminal operations. A stream pipeline is followed by zero 
 or more intermediate operations and a terminal operation.
 
 Intermediate operations return a new stream. They are always lazy; executing an intermediate operation such as 
 filter() does not actually perform any filtering, but instead creates a new stream. ex- filter(), map(), mapToInt()
 
 Terminal operations may traverse the stream to produce a result. After the terminal operation is performed, the 
 stream pipeline is considered consumed, and can no longer be used. ex- findFirst(), forEach(), reduce()
 exceptions- iterator() and spliterator(); these are provided as an "escape hatch".
 */

public class _02_main {
	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		for(int i =1; i<=10;i++)
		{
			values.add(i);
		}
		
		// We have used forEach method in previous class
		// The List can be converted into stream of data by
		values.stream().forEach(System.out::println);
		
		System.out.println("*************");
		// We can use parallel stream as well, which makes use of threads
		values.parallelStream().forEach(System.out::println);
		
		// Using same stream again will throw error
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
//		s.forEach(System.out::println); // comment it to prevent error
		
	}
}
