package com.kh.controller;

import java.util.Scanner;

public class Practice3 {
	
	/*
	 * 정수(양수)를 입력받아
	 * 짝수인지 홀수인지 출력하는 프로그램
	 * 
	 * [출력]
	 *  xx정수 입력 :
	 * 짝수다/ 홀수다/ 양수가 아니다
	 * 
	 * */

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int num ;
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else if ( num % 2 == 1) {
				System.out.println("홀수입니다.");
			} 
		} else {
			System.out.println("양수가 아니다.");
		}
		
	
	}

}
