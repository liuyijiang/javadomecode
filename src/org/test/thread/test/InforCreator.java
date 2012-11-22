package org.test.thread.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InforCreator implements Runnable{
  
	private List<String> list = null;
	private FileReader fileread = null;
	private BufferedReader br = null;
	
	public List<String> getNewList(){
		return this.list;
	}

	public InforCreator(List<String> list){
		this.list = list;
		try{
//		fileread = new FileReader(new File(".\\data\\data.txt"));
//		br = new BufferedReader(fileread);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void readData(){
		List<String>  newList = new ArrayList<String>();
		try{
			fileread = new FileReader(new File(".\\data\\data.txt"));
			br = new BufferedReader(fileread);
			String str = null;
			while((str = br.readLine())!= null){
				newList.add(str);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		if(list.size() != newList.size()){
			this.list = newList;
		}
		
	}
	
	
	@Override
	public void run() {
		while(true){
			readData();
			System.out.println("完成一次刷新");
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
