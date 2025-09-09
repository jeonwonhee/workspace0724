package com.kh.wholepratice;
import java.util.Scanner;
public class PraticeWhole2 {
	/*
	 * 알파벳 소문자로만 이루어진 단어가 주어진다. 
	 * 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		boolean isOk = true;
		for(int i =0, j=str.length()-1; i<j; i++, j--) {
			if(str.charAt(i)!= str.charAt(j)) {
				isOk = false;
				break;
			}
		}
		
		System.out.println(isOk ? 1: 0);

	}

}
