package com.example.oops;

public class StaticDemo {

	private static int x = 0;
	private int y = 3;

	public StaticDemo() {
		x++;
		y = y + 5;
		System.out.println("Static Value: " + x + " " + y);
	}

	public static void main(String[] args) {

		StaticDemo s1 = new StaticDemo();// 1, 8
		StaticDemo s2 = new StaticDemo();//2, 8
		StaticDemo s3 = new StaticDemo();

	}

}
