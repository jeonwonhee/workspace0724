package com.kh.operator;

import java.util.Scanner;

public class Pactice2 {
	
	/*
	 * 키보드로 정수 두개를 입력받아 두 수의 합, 차, 곱, 나누기, 나머지 값을 출력5
	 * 
	 * [출력]
	 * 첫번째 정수 : (키보드 입력)
	 * 두번째 장수 : (키보드 입력)
	 * 
	 * 더하기 : n
	 * 빼기 : n
	 * ...
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println("나누기 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));

	}

}
