package com.example.io;

import java.io.Serializable;

public class Student implements Serializable {
	 int id;
	 transient String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}