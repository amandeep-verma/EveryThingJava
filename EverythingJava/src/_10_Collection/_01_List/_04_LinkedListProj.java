package _10_Collection._01_List;
import java.util.LinkedList;

public class LinkedListProj4 {
	public static void main(String[] args) {
		
		
		// defining linked list
		LinkedList linky = new LinkedList();
		// adds
		linky.add("Rob");
		linky.add("van");
		linky.add("dam");
		linky.add(12112);
		
		
		
		
		// yellow lines indicated that for good practice we should mention the data type while defining the list
		// Like here we are defining it of string type, so we can only store string type data in it
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
		
		//adding object at a specific index
		int mid = linky2.size()/2;
		linky2.add(mid,"Mediocre");
		System.out.println("printing the linked list 2 after adding at index mid");
		System.out.println(linky2);
		
	}
}
