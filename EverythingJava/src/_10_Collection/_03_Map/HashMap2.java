package _10_Collection._03_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		
		// Keys are always unique
		// HashMap doesnt follows insertion order
		Map<Integer, String> a = new HashMap<>();
	
		a.put(3, "Becky");
		a.put(1, "Aman");
		a.put(4, "Becky");
		a.put(2, "Arjun");
		
		
		System.out.println(a);
		
		// putting the value with same key again will remove the previous key-value pair and add the new one
		a.put(2, "Arjun altered");
		System.out.println(a);
		
		System.out.println(a.get(5)); // throws null
		System.out.println(a.getOrDefault(5, "doesnt exists"));
		
		System.out.println(a.get(2));
		a.remove(2);
		System.out.println(a);
		
		
		final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1,11);
		map.put(2,22);
		map.put(3,33);
		map.put(4,44);
		
		System.out.println(map.size()); // returns size 
		System.out.println(map.get(1)); // returns value for key 1
		System.out.println(map.containsKey(3)); // checks if map contains key 3
		System.out.println(map.containsValue(33)); // checks if map contains value 33
		System.out.println(map.getOrDefault(6, 8888)); // if key 6 exists, returns the value else returns 8888
		Set<Integer> keys = map.keySet(); // returns the keySet of map, which you can work-on
		for(Integer key:keys)
		{
			System.out.println(map.get(key));
		}
		
		
		System.nanoTime();
		map.isEmpty();
		
		
		
		// Sorting the hashmap
	}
	

}
