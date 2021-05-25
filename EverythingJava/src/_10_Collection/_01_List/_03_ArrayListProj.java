package _10_Collection._01_List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListProj3 {

	public static void main(String[] args) {
		
		// defining ArrayList
		List fruitlist = new ArrayList();
		
		
		fruitlist.add("Apple");
		fruitlist.add("Orange");
		fruitlist.add("Banana");
		fruitlist.add("Strawberry");
		fruitlist.add(1212); // you can have element of different type
		// indexOf(object) - gives indexOf of object 
		System.out.println(fruitlist.indexOf("Apple"));
		

		// printing the ArrayList
		System.out.println("fruitlist ArrayList");
		System.out.println(fruitlist);
		
		
		// adding object to the ArrayList at desired index
		System.out.println("fruitlist ArrayList after adding");
		fruitlist.add(1, "Dates");
		System.out.println(fruitlist);
		
		
		// remove object from the ArrayList
		System.out.println("fruitlist ArrayList removing object");
		System.out.println(fruitlist.remove("Apple"));

		
		System.out.println(fruitlist);
		
		//checking if an object is in the ArrayList
		System.out.println("Checking if banana is present in fruitlist");
		System.out.println(fruitlist.contains("Banana"));
		
		
		//checking if an object is in the ArrayList
		System.out.println("printing the element index 2");
		System.out.println(fruitlist.get(2));
		
		// toArray(new String[0]) - to convert list to Wrapper type class
		Object[] fruits =  fruitlist.toArray(new Object[0]);
		
		
		
	}
}