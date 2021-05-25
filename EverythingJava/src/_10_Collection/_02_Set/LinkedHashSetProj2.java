package _10_Collection._02_Set;

import java.util.LinkedHashSet;

public class LinkedHashSetProj2 {

	public static void main(String[] args) {
		// follows insertion order
		LinkedHashSet<Double> a = new LinkedHashSet<Double>();
		
		a.add(23.0);
		a.add(23.0);  // doesn;t stores duplicate entries
		a.add((double)5); 
		a.add(new Double(3));
		System.out.println(a);
	}
}
