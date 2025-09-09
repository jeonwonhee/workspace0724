package com.kh.controller;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * 나이를 입력받아
		 * 13세 이하면 : 어린이
		 * 13세 초과 19세 이하 : 청소년
		 * 19세 초과 : 성인
		 * 
		 * [출력]
		 * 나이를 입력하세요 : xx
		 * xx은 xxx에 속합니다.
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		String str1;
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age >= 13) {
			str1 = "어린이";
	    } else if (age>13 && age <=19) {
	    	str1 = "청소년";
	    } else {
	    	str1 = "성인";
	    }
		
		System.out.println(age + "세는 " + str1 + "에 속합니다.");
		

	}
}

