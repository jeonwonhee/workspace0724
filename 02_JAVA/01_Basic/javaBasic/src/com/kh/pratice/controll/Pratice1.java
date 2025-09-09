package com.kh.pratice.controll;

import java.util.Scanner;
 /*
  * 0점부터 100점 사이의 정수를 입력받아 아래 조건에 따라 **등급(학점)**을 출력하는 프로그램을 작성하세요.
  * */
public class Pratice1 {

	public static void main(String[] args) {
		
		char grade;
		int point;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		point = sc.nextInt();
		
		if (point >= 90 && point<=100) {
			grade = 'A';
		} else if ( point >= 80 && point <=89) {
			grade = 'B';
		} else if ( point >= 70 && point <=79) {
			grade = 'C';
		} else if ( point >= 60 && point <=69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		 System.out.println("당신의 성적은 " + grade + "입니다.");

	}

}
