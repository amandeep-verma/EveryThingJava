package _10_Collection._03_Map;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class threePower {


	public static boolean checker(int n)
	{
		while(n!=0)
		{
			System.out.println(n);
			if(n != (n/3)*3)
				return false;
			n = n/3;
			if(n==3)
				return true;
		}
		return false;
		
			
	}

	public static void main(String[] args) {

		
		System.out.println(Integer.toString(5, 3));
//		
		
		Queue<String> pq = new PriorityQueue<>((a, b) -> 
        a.length() - b.length());
		
		pq.add("hell");
		pq.add("dsfsdfa");
		pq.add("bsfsdfa");
		pq.add("df");
		pq.add("dsfsdfaaa");
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		String abc ="jai ma";
		System.out.println(abc.charAt(0));
		StringBuilder a = new StringBuilder("jai");
		System.out.println(a.length());
		System.out.println(a.lastIndexOf("sd"));
		
		System.out.println(abc.matches(".*ma$"));
		
	}
}
