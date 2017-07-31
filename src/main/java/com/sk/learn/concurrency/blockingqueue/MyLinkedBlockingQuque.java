package com.sk.learn.concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * LinkedBlockingQueue Example.
 * 
 * @author shankarmodi
 *
 */

public class MyLinkedBlockingQuque {
	
	public static void main(String[] args) {
		
		BlockingQueue<String>  blockingQueue = new LinkedBlockingQueue<String>();
		
		new Thread(new Consumer(blockingQueue)).start();
		new Thread(new Producer(blockingQueue)).start();
	
	}

}
