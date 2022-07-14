package _10_Collection._01_List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _01_IterableProj {

	public static void main(String[] args) {
		
		// creating object co using collection
		
		Collection co = new ArrayList();
		
		// add() to add the elements to the collection
		co.add("chai");
		co.add("coffee");
		co.add("rusk");
		co.add("juice");
		co.add("bunn");
		
		
		Collection colist = new ArrayList();
		colist.add("ice cream");
		colist.add("fruit");
		colist.add("veggie");
		

		System.out.println("I am co -> "+co);
		
		// contains("object") - to check if list contains the object
		System.out.println("if co contains chai -> "+ co.contains("chai"));
		// isEmpty to see if list is empty
		System.out.println("if co is Empty -> "+co.isEmpty());
		// size() - to see the size of the collection
		System.out.println("size of co is -> "+co.size());
		
		
		System.out.println("I am colist -> "+ colist);
		
		// addAll() can be used to add another collection to the present collection
		System.out.println(co.addAll(colist));
		System.out.println("I am updated co -> "+co);
		
		System.out.println("if co contains all elements of colist -> "+ co.containsAll(colist));
		System.out.println("prints the class type of co "+ co.getClass());
		
		// remove() - to remove an object
		co.remove("veggie");
		System.out.println("I am updated co -> "+co);

		// printing each element
		System.out.println("--------Using iterator()------------");
		Iterator itr = co.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("--------Using for loop()------------");
		for(Object o : co)
		{
			System.out.println(o);
		}
		
		
		co.retainAll(colist);
		System.out.println("I am co after retaining elements from colist-> "+co);
		// clear() - clears the collection
		co.clear();
		System.out.println("I am co after clearning -> "+co);

	}
}
