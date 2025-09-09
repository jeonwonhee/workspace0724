package com.kh.array;
import java.util.Scanner;
public class ArrauPratice2 {
	/*
	 * N개의 정수가 주어질 때, 이들 중 최솟값과 최댓값을 찾는 프로그램을 작성하세요
	 * 첫째 줄: 정수의 개수 N (1 ≤ N ≤ 1,000,000)
	 * 둘째 줄: N개의 정수가 공백으로 구분되어 주어집니다. 각 정수는 −1,000,000 이상, 1,000,000 이하
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] iArr = new int[n];
		
		for (int i=0; i < n; i++) {
			iArr[i] = sc.nextInt(); 
		}
		
		//최솟값 최댓값
		 int min = 1000000; //Integer.MAX_VALUE : int로 표현할 수 있는 수 중에 가장 큰 수
		 int max = -1000000; //Integer.MIN_VALUE
		 
		 for(int num : iArr) {
			 if(num < min) {
				 min = num;
			 }
			 if(num > max) {
				 max = num;
			 }
			 
		 }
		 
		 System.out.print(min + " " + max);

	}

}
