package com.sk.learn.concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author shankarmodi
 *
 */

public class Producer implements Runnable {

	private BlockingQueue<String> queue = null;

	public Producer(BlockingQueue<String> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}

	public void run() {
		try {
			Thread.sleep(2000);
			queue.put("1");
			Thread.sleep(5000);
			queue.put("2");
			Thread.sleep(2000);
			queue.put("3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
