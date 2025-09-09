package com.kh.arraypratice;
import java.util.Scanner;
public class ArrayPratice1 {
	/*
	 * 크기가 N × M인 두 정수 행렬 A, B가 주어질 때, 두 행렬의 원소별 합을 구해 출력하세요.
	 * 첫째 줄: 정수 N, M (1 ≤ N, M ≤ 100)
	 * 다음 N줄: 행렬 A의 원소 M개
	 * 다음 N줄: 행렬 B의 원소 M개
	 * 각 원소는 −100 이상 100 이하의 정수
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		
		for(int i = 0 ; i<arrA.length; i++) {
			for(int j = 0; j <arrA[i].length; j++) {
				arrA[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i<arrB.length; i++) {
			for(int j = 0; j <arrB[i].length; j++) {
				arrB[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i<n; i++) {
			for(int j = 0; j <m; j++) {
				System.out.print((arrA[i][j] + arrB[i][j])+ " ");
			}
		}
		System.out.println();

	}

}
