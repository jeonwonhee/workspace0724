package com.kh.operator;

import java.util.Scanner;

public class Practice1 {
	
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계싼하여 출력하시오
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로) * 2
	 * 
	 * [출력]
	 * 가로 : (키보드로 입력)
	 * 세로 : (키보드로 입력)
	 * 
	 * 면적 : ~
	 * 둘레 : ~
	 * +소수점 2번째 자리까지 출력
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("가로값 입력 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로값 입력 : ");
		double height = sc.nextDouble();
		
		
		System.out.printf("사각형의 면적 : %.2f\n", (width * height));
		System.out.printf("사각형의 둘레 : %.2f\n", (width + height) * 2);

	}

}
