package com.examples.collections;

import java.util.Objects;

public class Employee {
	
	int age;

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age;
	}

	public Employee(int age) {
		super();
		this.age = age;
	}
	

}
