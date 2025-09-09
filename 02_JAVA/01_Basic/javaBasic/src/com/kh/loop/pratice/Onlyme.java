package com.kh.loop.pratice;
import java.util.Scanner;
public class Onlyme {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 10개의 정수를 입력받아, **짝수일 경우에만 제곱을 출력**하는 프로그램을 작성하세요.

	       홀수는 건너뛰고 출력하지 않습니다.
		Scanner sc = new Scanner(System.in);
		int num;
		for(int i=0; i<10; i++) {
			System.out.println("정수를 입력하세요: ");
			 num = sc.nextInt();
			
			if (num%2 != 0) {
				continue;
			}
			System.out.printf("%d의 제곱은 %d입니다.", num , num*num);
			//%d문법을 사용할 땐 printf 사용
		}*/
		
		/*
		 * 
	 * 사용자에게 정수를 반복 입력받아 **총합을 누적 계산**하는 프로그램을 작성하세요.

     단, **음수를 입력하면 입력을 종료**하고, 마지막에 누적된 총합을 출력하세요.*/
		Scanner sc = new Scanner(System.in);
		int num ;
		int sum = 0; 
		
		while(true) {
			System.out.println("정수를 입력하세요: ");
		    num = sc.nextInt();

		    if(num <0) {
		    	break;
		    
		    }
		    sum += num;
			
		}
		System.out.println("합계는 " + sum + "입니다." );
	}

}
