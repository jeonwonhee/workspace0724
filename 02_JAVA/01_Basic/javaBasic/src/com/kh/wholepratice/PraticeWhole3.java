package com.kh.wholepratice;
import java.util.Scanner;
public class PraticeWhole3 {
	/*
	 * 대소문자가 섞인 영어 단어에서 가장 많이 사용된 알파벳을 대문자로 출력하세요.
	 * 가장 많이 사용된 알파벳이 여러 개면 ?를 출력합니다.
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//대문자로 출력해야하므로 toUpperCase()이용
		String str = sc.next().toUpperCase();
		
		//index 갯수세기
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			int index = str.charAt(i) - 'A';
			count[index]++;
		}
		//최댓값
		int max = 0, index =0;
		boolean isDupl = false;
		for(int i=0; i<count.length; i++) {
			//max = count[i] > max ? count[i] : max;
			if(count[i] > max) {
				max = count[i];
				index = i;
				isDupl = false;
			}else if(count[i] == max) {
				isDupl = true;
			}
		}
		 
		System.out.println(isDupl ? "?" : (char)(index +'A'));
	}

}
