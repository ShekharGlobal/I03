package com.example.abs;

public abstract class Car {
	
	private String color;
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void milage();
	
	public void getDrive() {
		System.out.println("cool");
	}
	
	

}
