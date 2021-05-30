package _10_Collection._02_Set;

// Sets can't store duplicates, can only store 1 null

import java.util.HashSet;
import java.util.Set;

public class _01_HashSetProj {
	

	public static void main(String[] args){
		// Follows Hashtable as dataStructure 
		// doesn't follows insertion order
		// HashSet are best for dynamic programming as lookup takes almost O(1) time
		// Initial cap 16
		// Incremental cap - (75% of old cap) + old cap
		
		Set<Integer> a = new HashSet<>();
		a.add(5);
		a.add(3);
		a.add(3); // can't store duplicate
		a.add(null);
		a.add(100);
		a.add(-100);
		a.add((Integer)12);
		a.add((int)12);
		

		// Follows no insertion order.
		System.out.println("Set A -> "+a);
		
		// All other methods are similar to List. Refer _02_ListProject from _10_Collection _01_List
	}
}
