package com.practice.thread;


public class RunnableDemo implements Runnable {
	
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Running Thread " + threadName);
		doingWork();
		
		
	}
		
	public void start() {
		System.out.println("Starting Thread " + threadName);
		t = new Thread(this, threadName);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void doingWork() {
		for(int i = 0; i < 10; i++) {
			System.out.println(threadName + " doing work: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " finishing work: " + i);
		}
	}
	
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		r1.start();
		System.out.println("Finish Thread-1 work");
		
		RunnableDemo r2 = new RunnableDemo("Thread-2");
	    r2.start();
	    System.out.println("Finish Thread-2 work");
	}
}
