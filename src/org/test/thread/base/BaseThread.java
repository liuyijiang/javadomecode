package org.test.thread.base;

public class BaseThread implements Runnable {
    
	private BaseNumber b;
	private String name;
	private int number = 0;
	
	public BaseThread(BaseNumber b,String name){
		this.b = b;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		add();

	}

	private void add(){
		for(int i=0;i< 10;i++){
			number++;
			System.out.println(name +" -- "+ number);
		}
	}
	
}
