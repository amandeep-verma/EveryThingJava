package _10_Collection._03_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

public class _01_HashMap {

	public static void main(String[] args) {

		// HashMap doesnt follows insertion order
		// Keys are always unique, if you enter duplicate, new keypair replaces the old
		// one
		// Can store 1 null key
		// Initial Capacity =16, incremental = old +(0.75*old)
		// Supports multithreading but is not synchronized, which is to say if multiple
		// threads access it we must
		// externally synchronize the block of code which modifies the map.
		// When you add a key value pair, your function finds the hashcode for the key
		// and use
		// hashcode & (Bitwise and) size of hashtable, operation to find the index to
		// store the key value pair in the
		// hashtable. There it stores entry as a Node, with 4 values - key, value,
		// hashcode, next.
		// If another key with hashset happens to occur than it will have same index,
		// then another node will be added
		// to the already present Node pointed by next variable. ie LinkedList
		// If this LinkedList grows beyond a threshold value, it gets converted into a
		// balanced binary search tree.

		Map<Integer, String> a = new HashMap<>();

		// put() to add the elements
		a.put(13, "Becky");
		a.put(11, "Aishus");
		a.put(14, "Becky");
		a.put(12, "Arjun");
		a.put(10, "Karma");

		System.out.println(a);

		// putting the new value with same key again will removes the previous key-value
		// pair and add the new one
		a.put(12, "Arjun altered");
		System.out.println(a);

		// For the value that doesn;t exists
		System.out.println(a.get(5)); // throws null
		System.out.println(a.getOrDefault(5, "doesnt exists")); // you can specify a default value
		System.out.println(a.get(12)); // gets the value for key 12
		a.remove(12);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.containsKey(14));
		System.out.println(a.containsValue("Arjun")); // returns the Set of keys of map,
		System.out.println(a.isEmpty());

		Set<Integer> keys = a.keySet();
		List<String> values = new ArrayList<>(a.values());

		Set<Entry<Integer, String>> d = a.entrySet(); // you can obtain entry set like this.

		System.out.println(d);

		// Sorting the hashmap
		// Since hashmap doesn't follows insertion order, you can't sort the elements
		// within map

		// 1. You can store(Sorting based on key) keys in a set and sort the set, Now
		// you can fetch the values
		// using iterator in sorted fashion
		System.out.println("Sorted using Keyset and List");
		List<Integer> list = new LinkedList(a.keySet());
		list.sort(null); // Here we can perform custom sorting only for keys
		for (Integer key : list) {
			System.out.println(key + " = " + a.get(key));
		}

		// 2. Or you can store entry set.
		System.out.println("Sorted based on value(CustomSorting) using Map.Entry and List");
		List<Map.Entry<Integer, String>> li = new ArrayList<>(a.entrySet());
		// Since our list stores both keys and values we can perform custom sorting
		// using both or either.
		li.sort((o1, o2) -> {
			return o1.getValue().compareTo(o2.getValue()); // using compareTo since value is string
		});

		System.out.println(li);
		for (Map.Entry<Integer, String> entry : li) {
			System.out.println(entry);
		}

		// 3. Store map in a TreeSet
		// TreeMap cannot be sorted on values, you can custom sort on keys only
		System.out.println("Sorted by storing in TreeMap");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>((o1, o2) -> o2 - o1);
		treeMap.putAll(a);
		System.out.println(treeMap);

		// 4. Instead of using sorting, you can use priority queue to fetch the max
		// value holding key
		// and remove it each time, to achieve the goal.

		PriorityQueue<Map.Entry<Integer, String>> p = new PriorityQueue<>(
				(o1, o2) -> o1.getValue().compareTo(o2.getValue()));

	}
}
