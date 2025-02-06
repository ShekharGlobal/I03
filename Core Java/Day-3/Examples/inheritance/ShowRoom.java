package com.example.oops;

//Super/ Parent/ Base class
class Car {

	public void getDrive() {
		System.out.println("Very Nice");
	}
}

class Maruti extends Car {

	public void getMilage() {
		System.out.println("20KMPL");
	}
}

class Audi extends Car {

	public void maxSpeed() {
		System.out.println("200KMPH");
	}

}

public class ShowRoom {

	public static void main(String[] args) {
		
		Maruti m1= new Maruti();
		m1.getDrive();// Car
		m1.getMilage();// Maruti
		
		
		Audi a1= new Audi();
		a1.getDrive();//Car
		a1.maxSpeed();// Audi

	}

}
