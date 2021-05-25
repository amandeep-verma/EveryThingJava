package _10_Collection._03_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeHashMap3 {

	public static void main(String[] args) {
		
		// treeMap sorts the key value pair based on the keys
		
		Map<Integer, String> a = new TreeMap<Integer, String>();
		a.put(3, "Becky");
		a.put(1, "Aman");
		a.put(4, "Becky");
		a.put(2, "Arjun");
		
		System.out.println(a);
		
		
		HashMap<Integer,String> hashMaps = new HashMap<Integer,String>();
		hashMaps.putAll(a);
		System.out.println(hashMaps);
		
		
		Map<String, String> b = new TreeMap<>();
		
		b.put("echo dot","heh");
		b.put("ah", "kjdnf");
		b.put("ah1", "kjdnf");
		
		
		System.out.println(b);
		
		b.keySet();
		
		
		ArrayList<String>  test = new ArrayList<>();
		
		test.add("fp kindle Book");
		test.add("ab1 kindle Book");
		
		System.out.println(test);
		
		test.sort(null);
		System.out.println(test);
		
		
	}

}
