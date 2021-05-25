package _11_Java8;

import java.util.ArrayList;
import java.util.List;


//V13-V1 Telusko 



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
		// We can use parallel stream as well, which makes use of parallel 
		values.parallelStream().forEach(System.out::println);
		
		
		
	}
}
