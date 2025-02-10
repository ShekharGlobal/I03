package com.example.collections;

public class DiamondMain {
	public static void main(String[] args) {
		// With diamond operator
		Box<String> box1 = new Box<String>();
		box1.setValue("Hello");
		System.out.println(box1.getValue());

		// With diamond operator
		Box<Integer> box2 = new Box<>();
		box2.setValue(21);
		System.out.println(box2.getValue());
	}
}
