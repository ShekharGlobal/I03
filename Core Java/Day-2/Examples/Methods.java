package com.example.basic;

public class Methods {

	public double sum(double x, double y) {
		double sum = x + y;
		return sum;

	}

	public static void main(String[] args) {
		
		Methods m1= new Methods();
		
		double z=m1.sum(20.5, 30.7);
		double z1= m1.sum(40.8, 40.5);
		
		System.out.println("Sum is: "+ z);
		System.out.println("Sum is: "+ z1);
		
		

	}

}
