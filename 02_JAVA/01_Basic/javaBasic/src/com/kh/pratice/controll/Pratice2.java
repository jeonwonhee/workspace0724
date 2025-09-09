package com.kh.pratice.controll;

import java.util.Scanner;

/*
 * 1부터 6까지 눈이 있는 세 개의 주사위를 던졌을 때, 아래 규칙에 따라 상금을 계산하는 프로그램을 작성하세요.
 * */
public class Pratice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, num3;
		int price = 0;
		int max;
	
		
		System.out.println("입력: ");
		num1= sc.nextInt();
		num2= sc.nextInt();
		num3= sc.nextInt();
		
	
	
		
		if (num1 == num2 && num2 == num3) {
			price = 10000 + ((num1)*1000);
		} else if ((num1 == num2 && num2 != num3) || (num1 == num3 && num2 != num3))   {
			price = 1000 + ((num1)*100);
		} else if (num2 == num3 && num1 != num3) {
			price = 1000 + ((num2)*100);
		}
		else {
			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3 && num2 > num1) {
				max = num2;
			} else {
				max = num3;
			}
			price = (max * 100);
		}
	
		System.out.println("상금은 " + price + "원입니다.");
		
		//java.lang.Math (자바에서 기본적으로 제공해줌)
		//int max = Math.max(n1,n2); ->둘 중 큰 값을 반환함
		//max = Math.max(max,n3)
		// price = max * 100;
		
		
	}
}
