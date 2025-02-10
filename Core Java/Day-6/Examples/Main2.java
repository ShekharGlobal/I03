package com.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		
		Employee e1= new Employee(21);
		Employee e2= new Employee(22);
		
		Set< Employee> a1= new HashSet<Employee>();
		a1.add(e2);
		a1.add(e1);
		
		for(Employee el: a1) {
			System.out.println(e1.age + " ");
			System.out.println();
		}

	}

}
