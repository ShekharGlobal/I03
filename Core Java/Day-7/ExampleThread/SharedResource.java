package com.example.thread;

public class SharedResource {
	private static int count = 0;

	public static synchronized void increment() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable incrementTask = () -> {
			for (int i = 0; i < 1000; i++) {
				SharedResource.increment();
			}
		};
		Thread t1 = new Thread(incrementTask);
		Thread t2 = new Thread(incrementTask);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final count: " + SharedResource.getCount());
	}
}