package com.kh.pratice.controll;

import java.util.Scanner;

public class Pratice3 {
	
	/*
	 * 어린이, 청소년, 성인의 구분에 따라 입장료가 다르게 부과되는 **놀이공원 요금 계산기**를 만들어보세요.
       또한, 주말에는 20% 할인이 적용됩니다.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age ;
		char day;
		int money;
		
		
		System.out.println("나이를 입력하세요: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("요일을 입력하세요: ");
		day = sc.next().charAt(0);
		
		
		if (age <= 12) {
			money = 5000;
			System.out.println("어린이 요금입니다.");
		} else if (age>=13 && age <=18) {
			money = 7000;
			System.out.println("청소년 요금입니다.");
		} else {
			money = 10000;
			System.out.println("어른 요금입니다.");
		}
		
		switch (day) {
		case '월', '화', '수', '목', '금':
			System.out.println("최종 요금은 " + money + "원입니다.");
		break;
		case '토', '일' :
			System.out.println("최종 요금은 " + (int)(money*0.8) + "원입니다.");
		break;
		}
		/*
		 * if(day.equals("토") || day.equals("일"){
		 *    money = (int)(money * 0.8);
		 * }
		 * */
		
	}

}
