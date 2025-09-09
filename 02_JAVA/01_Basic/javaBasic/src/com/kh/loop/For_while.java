package com.kh.loop;

import java.util.Scanner;

public class For_while {
	/*
	 *  //구구단
	 int dan = 2;
	 /*
	 //1~9까지 1씩 증가하며서 반복
	 for (int i = 1; i <=9; i++) {
		 System.out.printf("%d * %d = %d\n" , 2 ,i , (2 * i));
	 }
	
	 
    for ( int j =2; j <=6; j++) {
   	 for (int i = 1; i <=9; i++) {
			 System.out.printf("%d * %d = %d\n" , j ,i , (j * i));
}
	 * */
	public static void main(String[] args) {
	/*
	 * 정수 N(1 ≤ N ≤ 9)이 주어졌을 때, N 단 구구단을 1부터 9까지 출력하는 프로그램을 작성하세요.
	 *  출력 형식은 N * i = 결과이며,
	 *  각 줄마다 i가 1부터 9까지 하나씩 증가합니다. 공백과 기호 표현에 주의하세요
	 * */
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for( int i = 0; i <10; i++) {
			System.out.printf("%d * %d = %d\n", n ,i , (n * i));
		}
		
		sc.close();
		
		
  }

}