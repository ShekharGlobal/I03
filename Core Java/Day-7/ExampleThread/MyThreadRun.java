package com.example.thread;

public class MyThreadRun implements Runnable {
	@Override
	public void run() {
		for (int x = 0; x < 3; x++) {

			try {
				Thread.sleep(1 * 60 * 100);
				System.out.println("Thread Is running" + " " + Thread.currentThread().getName() + " " + x);
			} catch (InterruptedException e) {
				
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		MyThreadRun m1 = new MyThreadRun();
		MyThreadRun m2 = new MyThreadRun();

		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);

		t1.setName("first");
		t2.setName("second");// 5

		//t1.setPriority(Thread.MAX_PRIORITY);

		t1.start();// 5
		t2.start();// 5
		t1.join();
		t2.join();

		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread" + i);
		}

	}

}
