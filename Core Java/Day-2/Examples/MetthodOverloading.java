package com.example.oops;

public class MetthodOverloading {
	
	public int sum(int x, int y) {
		int sum= x+y;
		return sum;
	}
	
	public int sum(int x, int y, int z) {
		int sum= x+y+z;
		return sum;
	}
	
	public float sum(float x, float y) {
		float sum= x+y;
		return sum;
	}
	
	public double sum(double x, double y) {
		double sum= x+y;
		return sum;
	}
	
	
	public String Sum(String s1, double d2) {
		String sum = s1+ d2;
		return sum;
	}
	
	public String Sum(double d2, String s1 ) {
		String sum = d2+ s1;
		return sum;
	}
	
	
	
	

	public static void main(String[] args) {
		
		MetthodOverloading m1= new MetthodOverloading();
		System.out.println(m1.sum(21.5, 23.6));
		

	}

}
