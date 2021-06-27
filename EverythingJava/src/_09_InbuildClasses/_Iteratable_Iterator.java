package _09_InbuildClasses;

import java.util.Iterator;
import java.util.NoSuchElementException;
/*
 For a class with group of elements with elements pointing to one another, can be iterated over using 
 1. enhanced for loop - for(Item a: List) loop,  
 2. forEach loop,
 3. Iterator<Item>
 
 To achieve above the class must implement the  Iterable Interface.
 Iterable interface have one unimplemented method iterator() whose return type is Iterator. 
 
 Iterator is the top most interface in the hierarchy chart of collections. Iterator class has 2 unimplemented method
 hasNext() and next(). 
 
 The class implementing Iterable interface needs to implement iterator() method for which you need object of Iterator. 
 Therefore, you have to make another class which implements Iterator interface and implement hasNext() and next(). 
 Then yu can return the of this class to iterator() method.
 */

class StackUsingLinkedList<Item> implements Iterable<Item>{
	private Node first;
	private int N;

	StackUsingLinkedList() {
		first = null;
		N = 0;
	}

	// Node inside
	private class Node {
		private Item item;
		private Node next;
	}

	public void push(Item item) {
		Node second = first;
		first = new Node();
		first.item = item;
		first.next = second;
		N++;
	}

	public Item pop() {
		if (!isEmpty()) {
			Item item = (Item) first.item;
			first = first.next;
			N--;
			return item;
		} else
			throw new NullPointerException("Stack is Empty");
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Item item : this)
            s.append(item + " ");
        return s.toString();
        
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
		}
	}
}

public class _Iteratable_Iterator {

	public static void main(String[] args) {

		StackUsingLinkedList<Integer> st = new StackUsingLinkedList<Integer>();

		System.out.println("pushing elements in the stack");
		for (int i = 0; i < 15; i++) {
			st.push(i);
		}

		System.out.println("printing elements of the stack");
		System.out.println(st);

		System.out.println("popping elements out of the stack");
		
		for (int i = 0; i < 15; i++) {
			System.out.println("size= " + st.size() + " element= " + st.pop());
		}
	}

}

