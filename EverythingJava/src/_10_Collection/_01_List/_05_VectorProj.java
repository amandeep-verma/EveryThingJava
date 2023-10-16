package _10_Collection._01_List;
import java.util.Vector;
/*
 Follows growable array as datastructure. 
 Initial Capacity 10. Incremental capacity = 2* old capacity
 Doesn't support multi threading
 Vectors are synchronized which is to say only 1 thread can access it at one time.
 Vectors supoort both iterator and enumeration. 
 */
public class _05_VectorProj {
	public static void main(String[] args) {
		
		Vector<String> fruitlist = new Vector<>();
		fruitlist.add("Apple");
		fruitlist.add("Orange");
		fruitlist.add("Banana");
		fruitlist.add("Strawberry");
		
		System.out.println(fruitlist.capacity());
		System.out.println(fruitlist.lastElement());
		System.out.println(fruitlist.firstElement());
		
	}
}
