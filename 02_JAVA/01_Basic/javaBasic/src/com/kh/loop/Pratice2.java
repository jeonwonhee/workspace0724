package com.kh.loop;

import java.util.Scanner;

public class Pratice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스
		
		for(int i = 1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d\n", i, (a+b));
		}
		sc.close();

	}

}
