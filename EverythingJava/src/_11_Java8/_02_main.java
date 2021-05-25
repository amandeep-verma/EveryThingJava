package _11_Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//V13-V1 Telusko 

/*
 Stream API has lots of method to process Huge amount of data (bigData, Hadoop)
 Also we have Intermediate methods and Terminate methods.
 Once you have used Stream of data, you can't reuse it.
 
 
 */

public class _02_main {
	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		for(int i =1; i<=100;i++)
		{
			values.add(i);
		}
		
		// We have use forEach method in previous class
		// The List can be converted into stream of data by
		values.stream().forEach(System.out::println);
		
		System.out.println("*************");
		// We can use parallel stream as well, which makes use of threads
		values.parallelStream().forEach(System.out::println);
		
	}
}
