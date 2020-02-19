package com.practice.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Invoker implements Executor {

	@Override
	public void execute(Runnable command) {
		command.run();
	}
	
	public static void main(String[] args) {
//		Executor executor = new Invoker();
//		executor.execute(() -> {
//			System.out.println("Running....");
//		});
//		
//		ExecutorService es = Executors.newFixedThreadPool(10);
//		es.submit(new RunnableDemo("thread-1"));
//		es.submit(new RunnableDemo("thread-2"));
//		
//		es.shutdown();
		
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
		Future<String> future = ses.schedule(() -> {return "hello world";}, 1, TimeUnit.SECONDS);
		try {
			String result = future.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ScheduledFuture<?> sf = ses.schedule(() -> {}, 1, TimeUnit.SECONDS);
		
		ses.isShutdown();
		
	}
}

