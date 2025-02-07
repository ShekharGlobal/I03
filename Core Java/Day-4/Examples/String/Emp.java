package com.example.string;

public class Emp  {
	
	private int age;
	

	public Emp(int age) {
		super();
		this.age = age;
	}

	@Override
	public int hashCode() {
	
		return age;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		return true;
	}





	public static void main(String[] args) {
		Emp emp1= new Emp(21);
		Emp emp2= new Emp(21);
		System.out.println(emp1.equals(emp2));
	}

}
