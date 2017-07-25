package com.sk.learn.concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author shankarmodi
 *
 */

public class Consumer implements Runnable {

	private BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		// TODO Auto-generated constructor stub

		this.queue = queue;
	}

	public void run() {
		// TODO Auto-generated method stub

		System.out.println("In Consumer");
		try {
			System.out.println(queue.take());
			Thread.sleep(3000);
			System.out.println(queue.take());
			System.out.println(queue.take());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
