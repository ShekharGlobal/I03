package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefined {

	public static void main(String[] args) {
		
		Student s1= new Student("Surya", 21, 90);
		Student s2= new Student("Vikas", 21, 95);
		Student s3= new Student("Srisha", 21, 96);
		
		ArrayList<Student> a1= new ArrayList<Student>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		Iterator<Student> i1 = a1.iterator();
		while (i1.hasNext()) {
			Student s5= i1.next();
			System.out.print(s5.name);
			System.out.print(s5.age);
			System.out.print(s5.score);
			
		}
		

	}

}
