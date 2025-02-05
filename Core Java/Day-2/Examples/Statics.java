package com.example.oops;


public class Statics {
	
	static int a=10;// instance variable
	
	public static  void sum() {  //instance Method
		int x=10;
		int y=20;
		//System.out.println(a);
		int z=x+y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		//Statics s1= new Statics();
		
		System.out.println(Statics.a);
		Statics.sum();

	}

}
