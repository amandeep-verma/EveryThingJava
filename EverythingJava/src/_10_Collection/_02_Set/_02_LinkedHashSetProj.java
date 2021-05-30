package _10_Collection._02_Set;

import java.util.LinkedHashSet;

public class _02_LinkedHashSetProj {

	public static void main(String[] args) {
		// Follows insertion order
		// Follows Hashtable and doubleLinked list as dataStructure 
		// doesn't follows insertion order
		// HashSet are best for dynamic programming as lookup takes almost O(1) time
		// Initial cap 
		// Incremental cap - (75% of old cap) + old cap
		
		LinkedHashSet<Double> a = new LinkedHashSet<Double>();
		
		a.add(23.0);
		a.add(23.0);  // doesn;t stores duplicate entries
		a.add((double)5); // AutoBoxing
		a.add(new Double(3));
		a.add(null);
		a.add(13.0);
		a.add(-23.0);
		
		System.out.println(a);
	}
}
