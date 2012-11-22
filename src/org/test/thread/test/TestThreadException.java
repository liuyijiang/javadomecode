package org.test.thread.test;

import java.util.ArrayList;
import java.util.List;

public class TestThreadException {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<String>();
		InforCreator l = new InforCreator(list);
		Thread t1 = new Thread(l);
		t1.start();
		while(true){
			list = l.getNewList();
			for(String str : list){
				System.out.println(str);
			}
			System.out.println("--------------------------"+System.currentTimeMillis()+"---------------------");
			Thread.sleep(2000);
		}
		
	}

}
