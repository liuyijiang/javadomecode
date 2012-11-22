package org.test.thread.base;

public class TestSync implements Runnable {
   
	private Timer timer = new Timer();
    
	public static void main(String[] args) {
	    TestSync test = new TestSync();
	    Thread t1 = new Thread(test);
	    Thread t2 = new Thread(test);
	    t1.setName("t1");
	    t2.setName("t2");
	    t1.start();
	    t2.start();
	}
	
	
	public void run(){
	    timer.add(Thread.currentThread().getName());
	}
	
}

class Timer{
	
     private static int num = 0;
/**
   * synchronized,在执行该方法时锁住当前对象，别的线程就无法执行该方法
   * @param name
   */
	public void add(String name){
	//synchronized (this) {
	     num ++;
	     try {
	    	 Thread.sleep(1);
	    }catch (InterruptedException e) {
	    	
	    }
	     System.out.println(name+", 你是第"+num+"个使用timer的线程");
	   //}
	}
}
