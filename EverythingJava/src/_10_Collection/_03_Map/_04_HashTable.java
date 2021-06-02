package _10_Collection._03_Map;

import java.util.Hashtable;

public class _04_HashTable {
	public static void main(String[] args) {

		// Do not follow insertion order
		// Single Threaded
		// It is called Legacy class as it is present from JDK 1.0
		
		// MAJOR DIFF BETWEEN HASHTABLE AND HASHMAP - 
		// HASHMAP - Supports multithreaded but it is not synchronized, 
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		
		hashTable.put("Aliba", 12);
		hashTable.put("Bab", 20);
	
	}
}
