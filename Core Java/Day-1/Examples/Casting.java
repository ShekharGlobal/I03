package com.example.basic;

public class Casting {
	
	public void conversion() {
		int x= 200;//32 bit
		long l1=x;// 64 bit 
		System.out.println(x);
		
		
		
		long l2= 999999;
		int x2= (int) l2;
		
		System.out.println(x2);
		
		
		float f1= 200.85F;
		int x3= (int) f1;
		
		System.out.println(x3);
	}

	public static void main(String[] args) {
		
		Casting c1= new Casting();
		c1.conversion();
		
		

	}

}
