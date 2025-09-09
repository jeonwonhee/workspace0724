package com.kh.array;
import java.util.Scanner;
public class ArrayPratice5 {

	public static void main(String[] args) {
		/*
		 * 1번부터 N번까지 번호가 순서대로 적힌 바구니가 있습니다.
		 *  M개의 뒤집기 작업이 주어지며, 
		 * 각각은 i번부터 j번 바구니의 순서를 역순으로 바꾸는 작업입니다.
		 *  모든 작업 후 최종 바구니의 번호 배열을 출력하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //바구니수
		int m = sc.nextInt(); //반복작업수
		int[] basket = new int[n];
		
		for(int i=0; i<basket.length; i++) {
			basket[i]=i+1;
			
		}
		for(int k=0; k<m; k++) {
			int i = sc.nextInt()-1; //index로 변경
			int j = sc.nextInt()-1;
			
			while(i < j) { //순서를 역순으로 바꾸는 거........ 어렵당 흑
				int tmp = basket[i];
				basket[i] = basket[j];
				basket[j] = tmp;
				i++;
				j--;
			}
		}
		for(int num : basket) {
			System.out.print(num + " ");
		}

	}

}
