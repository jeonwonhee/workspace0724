package com.kh.array;
import java.util.Scanner;
public class ArrayPratice4 {
	/*
	 * 학생 30명이 있고, 28명이 과제를 제출했습니다. 
	 * 제출하지 않은 2명의 출석번호를 오름차순으로 출력하는 프로그램을 작성하세요. 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] submitStd = new boolean[30];
		
		for(int i=0; i<28; i++) {
			int num = sc.nextInt();
			submitStd[num - 1] =  true;
			
		}
		for(int i=0; i < submitStd.length; i++) {
			if(!submitStd[i]) {
				System.out.println(i+1);
			}
			
		}
	}

}
