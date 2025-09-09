package com.kh.controller;

import java.util.Scanner;

public class Switch {
	
	/*
	 * switch문도 if문과 동일하게 조건문
	 * 
	 * 다만, switch문은 값이 정확하게 일치(동등비교)하는 경우에만 사용됨
	 * 
	 * [표현식]
	 * switch (비교대상(정수, 문자, 문자열)) {
	 * case 값1 : 실행코드;
	 * case 값2 : 실행코드;
	 * case 값3 : 실행코드;
	 * ...
	 * default : 위의 값이 전부 일치하지 않았을 때 실행할 코드;
	 * 
	 * 
	 * break -> switch문 내에서 사용하면 해당코드가 실행되고 동시에 가장 가까운 switch문을 종료
	 * */

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아서
		 * 1일 경우 빨간색입니다.
		 * 2일 경우 파란색입니다.
		 * 3일 경우 초록색입니다.
		 * 다른 경우 모두 잘못입력했습니다. 를 출력
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("빨간색입니다.");
			break;
		case 2:
			System.out.println("파란색입니다.");
			break;
		case 3:
			System.out.println("초록색입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		*/ 
		
		/*
		 * 과일을 구매하는 프로그램을 작성하자
		 * 구매하고자 하는 과일을 입력하면
		 * 그에 맞는 가격이 출력되는 프로그램이다.
		 * 
		 * [출력]
		 * 구매하고자하는 과일(사과(2000원), 바나나(3000원), 딸기(5000원))
		 * xxx의 가격은 xxx입니다. 출력 / 잘못입력하셨습니다.
		 * */
		/*
		System.out.print("구매하고자 하는 과일(사과(2000원), 바나나(3000원), 딸기(5000원))을 입력하세요 : ");
		
		int price;
		String fruit = sc.next();
		
		
		switch (fruit) {
		case "사과" :
			System.out.println(fruit +"의 값은 2000원입니다.");
			break;
		case "바나나" :
			System.out.println(fruit +"의 값은 3000원입니다.");
			break;
		case "딸기" :
			System.out.println(fruit +"의 값은 5000원입니다.\"");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
        */
		
		/*
		switch (fruit) {
		case "사과" :
			price = 2000;
			break;
		case "바나나" :
			price = 3000;
			break;
		case "딸기" :
			price = 5000;
			break;
		
	}
	if(price==0) {
		System.out.println("잘못 입력하셨습니다.");
	}else {
		System.out.println(fruit + "의 가격은 " + price + "원 입니다." );
	}
*/
		/*
		 * 월을 입력 받아서 해당 월에 마지막 일이 며칠인기 출력하는 프로그램 작정
		 * 
		 * [출력]
		 * 월을 입력하세요 : xx
		 * xx월은 xx일까지 있습니다.
		 * */
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		int day = 0;
		
		switch (month) {
		case 1,3,5,7,8,10,12:
			day = 31;
		break;
		case 4,6,9,11:
			day = 30;
		break;
		case 2:
			day = 28;
		break;
		}
		
		System.out.printf( "%d월은 %d일까지 있습니다.", month, day);
		
			
		
		
	}
}
