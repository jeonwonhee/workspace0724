package com.kh.loop.pratice;
import java.util.Scanner;
public class Pratice2 {
	
	/*
	 * 사용자에게 정수를 반복 입력받아 **총합을 누적 계산**하는 프로그램을 작성하세요.

     단, **음수를 입력하면 입력을 종료**하고, 마지막에 누적된 총합을 출력하세요.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		/*
		do {
			System.out.println("수를 입력하세요: ");
			num = sc.nextInt();
			sum += num;
			
		} while(num>0);
		System.out.println("sum: "+ sum);*/
		
		while(true) {
			System.out.println("수를 입력하세요: ");
			num=sc.nextInt();
			
			if(num<0) {
				break;
			}
			sum += num;
			
		}
		System.out.println("총합: " + sum);
	}


	}

