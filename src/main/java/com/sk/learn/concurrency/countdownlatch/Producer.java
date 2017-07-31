package com.sk.learn.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Once Producer calls countDown() then only waiting consumer thread can start
 * its task. If before calling countDown() some exception thrown then consumer
 * thread will keep waiting for count come to zero.
 * 
 * @author shankarmodi
 *
 */
public class Producer implements Runnable {

	CountDownLatch countDownLatch = null;

	public Producer(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	public void run() {
		System.out.println("In Producer");
		try {
			Thread.sleep(5000);
			System.out.println("Producer Decrementing count");
			// temp();
			// Thread.sleep(5000);
			countDownLatch.countDown();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void temp() {
		throw new RuntimeException("Throwing exception");
	}

}
