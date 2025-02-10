package com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();

		l1.add("Orange");
		l1.add("Apple");
		l1.add("Grapes");
		//l1.add("Orange");
		
		/*
		 * l1.addFirst("Lemon"); l1.addLast("WaterMelon"); l1.add(1,"Pineapple");
		 * 
		 * System.out.println(l1);
		 * 
		 * l1.removeFirst(); l1.removeLast(); l1.remove(2);
		 */
		
		//System.out.println("After Removing "+ l1);
		

		Iterator<String> i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		//l1.push("Cherry");
		//System.out.println(l1.get(0));
		//l1.pop();
		
		//l1.offer("A");
		//l1.poll();
		
		
		System.out.println(l1);

	}

}
