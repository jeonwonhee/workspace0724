package com.kh.array;
import java.util.Scanner;
public class ArrayPratice {
	/*
	 * 정수 N개로 이루어진 수열 A와 정수 X가 주어집니다. 
	 * 이때, 수열 A에서 X보다 작은 수를 모두 입력된 순서대로 
	 * 공백 한 칸으로 구분하여 출력하는 프로그램을 작성하세요. 
	 * 
	 * [입력조
	 * 첫째 줄: 정수 N과 X (1 ≤ N, X ≤ 10,000)
	 * 둘째 줄: 수열 A를 이루는 정수 N개 (각 원소는 1 이상 10,000 이하)
	 * 
	 * [출력조건]
	 * A에서 X보다 작은 수들을 입력된 순서대로 공백으로 구분해 출력합니다.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수N
		int n = sc.nextInt();
        
		//정수X
        int x = sc.nextInt();
        
        int[] iArr = new int[n]; 

       
		
		for(int i=0; i<n; i++) {
			iArr[i] = sc.nextInt();
			
		}
		for(int i=0; i<iArr.length; i++) {
			if (iArr[i] < x) {
				System.out.print(iArr[i] + " ");
			}
		}

	}

}
