package com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> s = new LinkedList<String>();

		s.add("A");
        s.push("F");
		s.add("B");
		s.push("G");
		s.add("C");

		//s.addFirst("D");

		//s.add(2, "X");

		//s.addLast("Z");
		
		Iterator i1= s.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}

		System.out.println("Original List before deleting elements");

		System.out.println(s);

		s.removeFirst();

		s.removeLast();

		s.remove("C");

		System.out.println("Original List After deleting " + "first and last object");

		System.out.println(s);

		System.out.println("First object in linked " + "list: " + s.getFirst());

		System.out.println("Last object in linked list: " + s.peekLast());

		System.out.println(s.pop());
	}

}
