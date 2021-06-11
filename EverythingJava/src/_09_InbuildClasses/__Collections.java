package _09_InbuildClasses;

import java.util.ArrayList;
import java.util.Collections;

public class __Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		a.add(501);
		a.add(405);
		a.add(208);
		a.add(306);
		a.add(103);
		a.add(909);
		
		
		
		Collections.sort(a);
		System.out.println(a);
		
		System.out.println(Collections.binarySearch(a, 501));
		
		Collections.reverse(a);
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
		
		
		
	}

}
