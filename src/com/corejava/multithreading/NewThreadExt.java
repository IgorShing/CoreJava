package com.corejava.multithreading;

//Create a second thread by extending Thread
public class NewThreadExt extends Thread {

	NewThreadExt() {
		// Create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); // Start the thread
	}

	// This is the entry point for the second thread.
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
