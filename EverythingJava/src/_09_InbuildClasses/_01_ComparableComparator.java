package _09_InbuildClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 Comparable and Comparator. 
 
 For a list of objects of custom class, if you call Collection.sort(listName,null) or listName.sort(null), will throw 
 runtime error because program doesn't know how to compare the two objects. Now you can resolve it in 2 ways -
 

 Comparable interface- 
 For a custom class which you have access to, can implement the comparable interface and implement the compareTo(object o)
 method to define how the test objects are compared. So when you call sort method on the list of the objects of this 
 class, it is defined how two objects are compared. Return type of compareTo() is integer. Negative number specifies
 the calling object is smaller than the passed object, positive number specifies the reverse and 0 specifies both are 
 equal. Java uses internal sorting method to sort the elements, - + or a zero indicates whether it has to swap the
 objects or not. 
 Another classical use case is in Date Class written below
 
 
 Comparator interface- 
 For a custom or non-custom class when you want to define your own way of sorting, you can make object of Comparator 
 interface and pass it to listName.sort(comparatorObject) or Collection.sort(listName, comparatorObject) and have your
 list sorted. Using Comparator interface you can define multiple distinct ways of sorting. Here you implement the 
 compare(object o1, object o2) and its return type is also integer like for compareTo() in Comparable interface.
 
  Both are functional interface So you can use lambda expression 
 */

class test implements Comparable<test> {
	private int usn;
	private String name;

	public test(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return usn + " " + name;
	}

	public boolean equals(test o) {
		return this.getName().compareTo(o.getName()) == 0 ? true : false;
	}

	public int compareTo(test o) {
		// return this.usn - o.usn; // sorting by usn
		return this.name.compareTo(o.name); // sorting by name
	}

}


class Date implements Comparable<Date>
{
	private final int month, day, year;
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	@Override
	public int compareTo(Date that) {
		if (this.year < that.year)	return -1;
		if (this.year > that.year)	return +1;
		if (this.month < that.month)	return -1;
		if (this.month > that.month)	return +1;
		if (this.day < that.day)	return -1;
		if (this.day > that.day)	return +1;
		return 0;
	}
}

public class _01_ComparableComparator {


	public static void main(String[] args) {
		test t1 = new test(104, "Rahul");
		test t2 = new test(105, "Albert");
		test t3 = new test(101, "Maliaka");
		test t4 = new test(103, "Juan");
		test t5 = new test(102, "Kail");
		test t6 = new test(100, "Juan");

		List<test> li = new ArrayList<>();
		li.add(t1);
		li.add(t2);
		li.add(t3);
		li.add(t4);
		li.add(t5);
		li.add(t6);

		System.out.println("Are the two objects equal-> " + li.get(3).equals(li.get(5)));
		System.out.println(li);

		// Here both li.sort(null) and Collections.sort(li, null) use the compareTo method in the class test and if
		// that compareTo wasn;t implemented, it would throw error.
//		li.sort(null); // you can uncomment it and comment the line below, as they do the same job
		Collections.sort(li, null);
		System.out.println(li);
		

		
		// Custom Comparator object
		Comparator<test> c = (test o1, test o2) -> {
			return o1.getUsn() - o2.getUsn();
		};

		// Here we pass Comparator object in li.sort(c) and Collections.sort(li, c)
//		li.sort(c); // you can uncomment it and comment the line below, as they do the same job
		Collections.sort(li, c);
		System.out.println(li);
		
		// This can also be achieved by lambda expression
		Collections.sort(li, (o1,o2)->  o1.getName().compareTo(o2.getName()) );
	}
}
