package com.example.thread;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
	
		MyThread m1= new MyThread();
		m1.start();
	}

}
