package _10_Collection._01_List;
import java.util.LinkedList;

/*
Follows doubly linked list as data structure. 
No concept of inital capacity and incremental capacity.
Supports multi-threading but inherintly not thread-safe
Linked list are better performing when you have to object in between of the list as it uses nodes to point to 
next element. But when it comes to look up, linkedlist aren't great becuase you have to pass through each object
from begining.
*/
public class _04_LinkedListProj {
	public static void main(String[] args) {
		
		LinkedList<String> linky2= new LinkedList<String>();
		linky2.add("Rob");
		linky2.add("van");
		linky2.add("dam");
		linky2.add("Robba");
		linky2.add("vannna");
		linky2.add("dammma");
		
	
		System.out.println("printing the linked list 2");
		System.out.println(linky2);
		
		// checking the index of object van
		System.out.println(" index of object van is -> "+linky2.indexOf("van"));
		
		// adding object at beginning
		linky2.addFirst("hero");
		System.out.println("printing the linked list 2 after addFirst");
		System.out.println(linky2);
		
		//adding object at end
		linky2.addLast("Zero");
		System.out.println("printing the linked list 2 after addLast");
		System.out.println(linky2);

	}
}
