package com.kh.arraypratice;
import java.util.Scanner;
public class ArrayPratice2 {
	/*
	 * N × M 크기의 2차원 배열이 주어질 때, 
	 * 배열에 포함된 가장 큰 값과 그 값이 위치한 행 번호와 열 번호를 출력하세요.
	 * 행 번호와 열 번호는 1부터 시작합니다.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arrA = new int[n][m];
		
		for(int i=0; i<arrA.length; i++) {
			for(int j=0; j<arrA[i].length; j++) {
				arrA[i][j]=sc.nextInt();
			}
		}
		//int maxValue = -1000;
		//int minValue = 1000;
		int maxValue = Integer.MIN_VALUE;
		int x = 0;
		int y = 0;
		
		for(int i=0; i<arrA.length; i++) {
			for(int j=0; j<arrA[i].length; j++) {
				if(arrA[i][j] > maxValue) {
					maxValue = arrA[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println(maxValue);
        System.out.printf("%d %d", (x+1),(y+1));

	}

}
