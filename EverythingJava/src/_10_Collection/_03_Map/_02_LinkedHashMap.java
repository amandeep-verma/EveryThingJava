package _10_Collection._03_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _02_LinkedHashMap {

	public static void main(String[] args) {
		
		// LinkedHashMap follows insertion order
		// Keys are always unique, if you enter duplicate, new keypair replaces the old one
		// Can store 1 null key
		// Initial Capacity =16, incremental = old +(0.75*old)
		

		Map a = new LinkedHashMap();
		
		a.put(3, "Becky");
		a.put(1, "Aman");
		a.put(4, "Becky");
		a.put(2, "Arjun");
		a.put(false, 12.55);
		a.put(null,123);
		
		System.out.println(a);
		
		System.out.println("get the value at key = 1 => "+a.get(1));
		
		System.out.println("checks if it contains the key 3=> "+a.containsKey(3));
	
		Set keys =  a.keySet();
		System.out.println("After stroing the keys in set => "+keys);
		System.out.println("prinitng all value of a => "+a.values());
		
		a.remove(4,"Becky");
		System.out.println("After removing from LinkedHashMap => "+a);
		
		a.replace(3, "kaboom");
		System.out.println("After replcacing from LinkedHashMap => "+a);
		
		
		
	}

}
