package com.sk.learn.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch Example.
 * 
 * @author shankarmodi
 *
 */

public class CountDownLatchExample {

	public static void main(String[] args) {

		// Creating count down latch with count 1, means threads await() method
		// will will wait until countDown() method calls 1 time.
		CountDownLatch countDownLatch = new CountDownLatch(1);
		new Thread(new Consumer(countDownLatch)).start();
		new Thread(new Producer(countDownLatch)).start();

	}
}
