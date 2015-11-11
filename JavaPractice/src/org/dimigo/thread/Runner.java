package org.dimigo.thread;

import java.util.Random;

/*
 * <pre>
 * org.dimigo.thread
 * 		|_ Runner
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 * @author 신준섭
 *
 */
public class Runner extends Thread{
	private String name;
	
	public Runner(){
		
	}
	public Runner(String name){
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
