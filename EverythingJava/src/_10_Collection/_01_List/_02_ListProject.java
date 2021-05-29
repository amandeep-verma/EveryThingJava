package _10_Collection._01_List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class _02_ListProject {

	public static void main(String[] args) {
		
		// Since list is the interface extended from collection interface it has all the methods from collection interface
		
		List<String> co = new ArrayList<>();
		
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
		
		// Printing list
		System.out.println("The list co is -> "+co);
		
		// Following are the 4 ways to iterate through Lists
		for(Object a:co)
		{
			System.out.print( a+"- ");
		}
		
		System.out.println();
		
		for(int i=0; i<co.size();i++)
		{
			System.out.print(co.get(i)+"* ");// get(i) returns object at position i
		}
		System.out.println();
		
		Iterator<String> it  = co.iterator(); // iterator 
		
		// listIterator has more methods specific to List only. It has more methods. Both are used similary though
		Iterator<String> itr = co.listIterator(); 
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println();
		
		// Using lambda expression on Customer Interface
		co.forEach(i->System.out.print(i+"^ "));
		System.out.println();
		
		System.out.println(co.get(9));// get(a) - prints the element at position a
		
		System.out.println(co.indexOf("rusk"));// indexOf()- gives first index of object 
		
		
		// lastIndexOf(Object) - gives last index of the object in list
		System.out.println("Last index of rusk is ->"+co.lastIndexOf("rusk"));
		
		co.remove(7); // removes the element at index 7
		System.out.println("After removing element at index 7 -> "+co);
		
		co.add(7,"rusk");
		System.out.println("After adding rusk at index 7 -> "+co);
		
		System.out.println("Printing the sublist -> "+co.subList(2, 5));
		
		// sort takes Comparator object, specifying it null makes it to order in natural ordering of element.
		// You can define your own Comparator object and pass it for custom sorting.
		// for string type its lexographical sorting
		co.sort(null); // Sorting 
//		Collections.sort(co); // does the same.
		System.out.println(co); 
		
		Object objArray = co.toArray(); // toArray returns array of object type 
		
		//Pass the argument of return type array with size. 
		//If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with 
		//the runtime type of the specified array and the size of this list.
		String[] strArray = co.toArray(new String[0]); // to return array of specific type, pass non-primitive 
		
		
		// doing this you can't increase size of your list to accomodate more objects
		List<Integer> abc = Arrays.asList(5,55,-45,4545,-10);
		System.out.println(abc);
		
		// this is growable List
		abc = new ArrayList<>();
		abc.add(5);
		abc.add(55);
		abc.add(-45);
		abc.add(4545);
		abc.add(-10);
		
		// toArray() returns all the elements in the list into an object array
		for(Integer aa :abc.toArray(new Integer[0]))
		{
			System.out.print(aa+", ");
		}
		System.out.println();
		
		// typecast to wrapper class to remove the object
		// removes the Integer object 5
		abc.remove((Integer)5);
		System.out.println(abc);
		
		// removes the element at position 3
		abc.remove(3);
		System.out.println(abc);
		
		abc.sort(null); 
		System.out.println(abc);
		
		// Implementing compare() of functional interface Comparator for custom sorting
		Comparator<Integer> c = (o1, o2)->{
			return o1>o2? o2:o1;
		};
		
		abc.sort(c); 
		
		abc.sort((o1, o2)->
			o1>o2? o2:o1
		);
		
		System.out.println(abc);
		
	}

}
