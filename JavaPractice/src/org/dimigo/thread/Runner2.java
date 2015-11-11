package org.dimigo.thread;

import java.util.Random;

public class Runner2 implements Runnable{
	private String name;
	
	public Runner2(){
		
	}
	public Runner2(String name){
		this.name = name;
	}
	public void run(){
		int time;
		System.out.println(name + " 출발");
		for(int i=100; i>=0; i-=10){
			time = new Random().nextInt(100);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " " + i + " 미터");
		}
		System.out.println(name + " 골인");
	}
}
