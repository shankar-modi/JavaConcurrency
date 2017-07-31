package com.sk.learn.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Consumer thread will keep waiting till producer finished its task and calls
 * countDown() method. Consumer will wait by calling await() method.
 * 
 * @author shankarmodi
 *
 */

public class Consumer implements Runnable {

	CountDownLatch countDownLatch = null;

	public Consumer(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	public void run() {

		System.out.println("In Consumer");
		System.out.println("Consumer waiting for counting come to zero.");
		try {
			countDownLatch.await();
			System.out.println("Consumer started its task after producer completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
