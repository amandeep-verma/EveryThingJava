package _10_Collection._01_List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProject2 {

	public static void main(String[] args) {
		
		// Since list is the interface extended from collection interface it has all the methods from collection interface
		
		//creating a list object
		List co = new ArrayList();
		
		//adding elements
		co.add("chai");
		co.add("coffee");
		co.add("rusk");
		co.add("juice");
		co.add("bunn");
		co.add("chai");
		co.add("coffee");
		co.add("rusk");
		co.add("juice");
		co.add("bunn");
		
		System.out.println("The list co is -> "+co);
		
		System.out.println("methods specific to List");
		// listIterator is similar to iterator()
		
		Iterator l  = co.iterator();

		Iterator itr = co.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		for(Object a:co)
		{
			System.out.println("-" + a);
		}
		
		for(int i=0; i<co.size();i++)
		{
			System.out.println("*"+co.get(i));
		}
		
		// indexOf()- gives first index of object 
		System.out.println(co.indexOf("rusk"));
		// get(a) - prints the element at position a
		System.out.println(co.get(9));
		
		// lastIndexOf(Object) - gives last index of the object in list
		System.out.println("Last index of rusk is ->"+co.lastIndexOf("rusk"));
		co.remove(7); // removes the element at index 7
		System.out.println("After removing element at index 7 -> "+co);
		co.add(7,"rusk");
		System.out.println("After adding rusk at index 7 -> "+co);
		System.out.println("Printing the sublist -> "+co.subList(2, 5));
		// prints the element at position 0
		System.out.println(co.get(0));
		
		List<Integer> abc = new ArrayList();
		abc.add(5);
		abc.add(55);
		abc.add(-45);
		abc.add(4545);
		abc.add(-10);
		System.out.println(abc);
		// sort() is used to sort the list
		abc.sort(null);
		System.out.println(abc);
		
		// toArray() returns all the elements in the list into an object array
		for(Integer aa :abc.toArray(new Integer[0]))
		{
			System.out.println(aa);
		}

		
		// typecast to wrapper class to remove the element
		abc.remove((Integer)5);
		// removes the element at position 3
		abc.remove(0);
		System.out.println(abc);
		abc.remove(0);
		System.out.println(abc);
		
	}

}
