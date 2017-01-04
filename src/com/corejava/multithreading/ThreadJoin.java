package com.corejava.multithreading;

public class ThreadJoin implements Runnable {

	String name; // name of thread
	Thread t;

	ThreadJoin(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); // Start the thread
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}

}
