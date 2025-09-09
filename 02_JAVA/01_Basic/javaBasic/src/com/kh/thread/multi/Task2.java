package com.kh.thread.multi;

public class Task2 extends Thread{

	//20이하의 짝수만 출력
	@Override
	public void run() {
		for(int i=1; i<21; i++) {
			if(i%2==0) {
				System.out.println(i + " ");
			}
		}
	}
	

}
