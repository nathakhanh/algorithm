package com.practice.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Barrier implements Runnable{

	private CyclicBarrier barrier;
	
	public Barrier(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		try {
            System.out.println(Thread.currentThread().getName() + 
              " is waiting");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + 
              " is released");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, () -> {
			System.out.println("All previous tasks are completed");
		});
		
		 Thread t1 = new Thread(new Barrier(cb), "T1"); 
		 Thread t2 = new Thread(new Barrier(cb), "T2"); 
		 Thread t3 = new Thread(new Barrier(cb), "T3"); 
		 
		 if (!cb.isBroken()) { 
		        t1.start(); 
		        t2.start(); 
		        t3.start(); 
		 }
	}

}
