package com.kh.array;
import java.util.Scanner;
public class ArrayPratice3 {
	/*
	 * N개의 바구니(1~N번)가 있고, M개의 공 넣기 작업이 주어집니다.
	 *  각 작업은 i번 바구니부터 j번 바구니까지 숫자 k가 적힌 공을 넣는 것을 의미합니다. 
	 * 그 후 각 바구니에 어떤 공이 들어 있는지 출력하세요. 공이 없는 경우 0으로 출력합니다. 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //바구니 수
		int m = sc.nextInt(); //작업반복횟수
		
		int[] basket = new int[n];
		
		for(int h=0; h<m; h++) {
			int i = sc.nextInt(); //i번째 바구니부터
			int j = sc.nextInt(); //j번째 바구니까지
			int k = sc.nextInt(); //k를 대입
			for(int idx = i; idx<=j; idx++) {
				basket[idx-1]=k;
			}
		}
		for(int num : basket) {
			System.out.print(num + " ");
			
		}

	}

}
