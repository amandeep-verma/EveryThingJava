package _10_Collection._02_Set;

import java.util.TreeSet;

public class TreeSetProj3 {

	public static void main(String[] args) {
		// doesn't store any null value and duplicates
		// if we store homogeneous element in TreeSet, they are automatically sorted
		/* TreeSet implements comparable interface, so if we store heterogeneous element it throws error while printing, 
		SO WE MUST ONLY STORE HOMOGENEOUS ELEMENTS IN THE TREESET
*/
		TreeSet<Byte> b = new TreeSet<>();
		byte i = 99;
		b.add(new Byte(i));
		b.add(new Byte("23"));
		b.add(new Byte("54"));
		b.add((byte) 45);
		
		System.out.println(b);
		
		System.out.println(b.first());
		
		System.out.println(b.pollFirst());
		System.out.println(b);
		System.out.println(b.pollLast());
		System.out.println(b);
		
	}

}
