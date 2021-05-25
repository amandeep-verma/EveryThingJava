package _10_Collection._02_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProj1 {
	
    public static int pos(int num)
    {
    	num =  (num>=0) ?  num: -num;
    	return num;
    }

	public static void main(String[] args) {

		// sets can't store duplicates, can only store 1 null
		// doesn't follows insertion order
		// HashSet are best for dynamic programming
		HashSet a = new HashSet();
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(null);
	
		

		System.out.println(Math.abs(-3));
		
		System.out.println("printing set a "+a);
		
		a.add(new Browser0());
		Browser0 chrome = new Browser0("chrome", 50);
		a.add(chrome);
		
		System.out.println("printing set a "+a);
		
		System.out.println("%%%%%For Each Loop%%%%");
		for (Object obj : a) {
			System.out.println(obj);
		}
		
		System.out.println("--------Using iterator()------------");
		Iterator itr = a.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		HashSet<Integer> b = new HashSet<Integer>();
		
		b.add(5);
		b.add(6);
		
		Integer[] pr =  b.toArray(new Integer[0]);
	}
}
