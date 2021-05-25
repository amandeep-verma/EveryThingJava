package _10_Collection._01_List;
import java.util.Vector;

public class VectorProj5 {
	public static void main(String[] args) {
		
		Vector fruitlist = new Vector();
		fruitlist.add("Apple");
		fruitlist.add("Orange");
		fruitlist.add("Banana");
		fruitlist.add("Strawberry");
		fruitlist.add(1212); // you can have element of different type
		
		
		Vector v2 = new Vector();
		v2.add("Rob");
		v2.add("van");
		v2.add("dam");
		v2.add("Robba");
		v2.add("vannna");
		v2.add("dammma");
		System.out.println("printing the linked list 2");
		System.out.println(v2);
		
		System.out.println("capacity of vector v2 is " +v2.capacity());
		
		v2.size();
		
		System.out.println(Integer.MAX_VALUE);
		
	}
}
