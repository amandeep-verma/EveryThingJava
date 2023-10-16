package _10_Collection._01_List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
ArrayList follows growable array as datastructure. 
Supports multi-threading but inherintly not thread-safe
ArrayList is not synchronized, which is to say if multiple threads access the arraylist we must externally synchronize the block of 
code which modifies the list. But it is still preferred one.
Intial capacity is 10 and incremental capacity is - (3/2* oldcapacity)+1
ArrayList is efficient when we want to store or insert element at the end of an arrayList. But when we are trying to add
element in between the the collection it invloves shift operator and its not efficient then.

*/
public class _03_ArrayListProj {

	public static void main(String[] args) {
		
		// defining ArrayList
		List<String> fruitlist = new ArrayList<>();
		
		fruitlist.add("Apple");
		fruitlist.add("Orange");
		fruitlist.add("Banana");
		fruitlist.add("Strawberry");
		
		// indexOf(object) - gives indexOf of object 
		System.out.println(fruitlist.indexOf("Apple"));

	}
}
