package com.example.abs;

public class Main {

	public static void main(String[] args) {
		
		//Car c1= new Car();

		 Car c1= new Maruti();
		 c1.milage();
		 c1.getDrive();
		 c1.setColor("Deep Forest");
		 System.out.println("Maruti Color : "+ c1.getColor());
		 
		 
		 Car c2= new Audi();
		 c2.milage();
		 c2.getDrive();
		 
		 c2.setColor("White");
		 System.out.println("Audi Color : "+ c2.getColor());
	}

}
