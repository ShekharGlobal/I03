package com.example.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		
		//Set<String> s1= new HashSet<>();
		//Set<String> s1= new LinkedHashSet<>();
		//unique+ unsorted
		SortedSet<String> s1= new TreeSet<>();
		
		s1.add("Orange");
		s1.add("Apple");
		s1.add("Mango");
		s1.add(null);
		s1.add(null);
		s1.add("Orange");
		
		Iterator<String> i1= s1.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+ " ");
		}
	}

}
