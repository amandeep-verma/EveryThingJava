package _10_Collection._02_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class _03_TreeSetProj {

	public static void main(String[] args) {
		// doesn't store any null value and duplicates
		// if we store homogeneous element in TreeSet, they are automatically sorted
		// TreeSet implements comparable interface, SO WE MUST ONLY STORE HOMOGENEOUS
		// ELEMENTS IN THE TREESET

		TreeSet<Byte> b = new TreeSet<>();
		byte i = 99;
		b.add((byte) 12);
		b.add(new Byte(i));
		b.add(new Byte("23"));
		b.add(new Byte("54"));

		System.out.println(b);

		System.out.println(b.first());
		System.out.println(b.pollFirst());
		System.out.println(b);
		System.out.println(b.pollLast());
		System.out.println(b);

		// Custom comparator using lambda expression
		TreeSet<Integer> d = new TreeSet<Integer>((o1, o2) -> o2 - o1);

		d.add(55);
		d.add(12);
		d.add(100);
		System.out.println(d);
	}

}
