package org.test.thread.basetest;

public class TestThreadJoin {

	public void test(){
		 try {
			 BaseTestThread t = new BaseTestThread();
              t.start();
              
             System.out.println(t.getNum());
		   //t.join();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		TestThreadJoin t = new TestThreadJoin();
//		t.test();
		 System.out.println("sss");
	}

}
