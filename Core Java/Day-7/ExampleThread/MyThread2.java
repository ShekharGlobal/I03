package com.example.thread;

public class MyThread2 extends Thread {
	
	public int sum(int x, int y) {
		int sum=x+y;
		return sum;
		
	}

	public void run() {
		
		int result= sum(5,8);
		System.out.println("The Result "+ result);
	}

	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();

		// t1.run();
		t1.start();// 5
		t2.start();// 5

	}

}
