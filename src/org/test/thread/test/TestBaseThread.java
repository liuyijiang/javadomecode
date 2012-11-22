package org.test.thread.test;

import org.test.thread.base.BaseNumber;
import org.test.thread.base.BaseThread;

public class TestBaseThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Integer b=0;
		BaseNumber b = new BaseNumber(0);
		Thread t1= new Thread(new BaseThread(b, "Thread-1"));
		Thread t2= new Thread(new BaseThread(b, "Thread-2"));
		Thread t3= new Thread(new BaseThread(b, "Thread-3"));
		t1.start();
		t2.start();
		t3.start();
		System.out.println(b.getNumber());
	}

}
