package org.test.thread.basetest;

public class BaseTestThread extends Thread{
    
	private int num;
	
	public BaseTestThread(){
		this.num = 0;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	@Override
	public void run() {
		for(int i=0;i<5;i++){
			try{
				num = i;
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
