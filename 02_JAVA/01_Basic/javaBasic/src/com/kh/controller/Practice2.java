package com.kh.controller;

import java.util.Scanner;

public class Practice2 {
	
	/*
	 * 성별을 (m/f)(대소문자 상관x)로 입력받아 남학생인지 여학생인지
	 * 출력하는 프로그램을 작성해라
	 * 
	 * [출력]
	 * 성별(m/f) : x
	 * 여학생입니다/ 남학생입니다 / 잘못입력하셨습니다.
	 * */

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
	 System.out.println("성별을 입력하세요(m/f) : ");
	 
	 char gender;
	 gender = sc.next().charAt(0);
	 
	 switch (gender) {
	 case 'm':
	 case 'M':
		 System.out.println("남학생입니다.");
	 break;
	 case 'f':
	 case 'F':
		 System.out.println("여학생입니다.");
	 break;
	 default:
			System.out.println("잘못 입력하셨습니다.");
	 
	 
	 }
	}
	
	

}
