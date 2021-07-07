package _10_Collection._01_List;

import java.util.PriorityQueue;


/*
 Based on priority heap
 Takes log(n) time for both insertion and deletion
 As DS, its performnance is better than binary search trees.
 */

public class _07_PriorityQueueProj {
	public static void main(String[] args) {
		
		// adding and removing an element takes log(n) time. 
		// Each time you take an element 
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(12);
		p.add(10);
		p.add(7);
		p.add(100);
		p.add(93);
		p.add(17);
		p.add(50);
		p.add(1);
		p.add(30);
		
		
		
		System.out.println(p);
		System.out.println(p.size());
		
		System.out.println("the head element is "+p.element()); // peeks the top most element, if empty throws exception
		System.out.println("the head element is "+p.peek()); // peeks the top most element, if empty returns null
		
		
		System.out.println("removing the root item "+p.remove()); // remove the root element, if empty throws exception
		System.out.println("removing the root item "+p.poll()); // removes the root element, if empty returns null
		
		System.out.println("checks PriorityQueue if contains 100 ="+p.contains(100));
		
		System.out.println("if PriorityQueue is empty "+p.isEmpty()); // 
		
		
		// Using custom comparator
		p = new PriorityQueue<>((o1, o2) -> o2 - o1 );
		p.add(12);
		p.add(10);
		p.add(7);
		p.add(100);
		p.add(93);
		p.add(17);
		p.add(50);
		p.add(1);
		p.add(30);
		System.out.println(p);
	}
}
