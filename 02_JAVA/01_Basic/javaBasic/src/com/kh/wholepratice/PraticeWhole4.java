package com.kh.wholepratice;
import java.util.Scanner;
public class PraticeWhole4 {
	//크로아티아 알파벳
	
	/*
	 * 문자열 replace("찾을 문자열", "바꿀문자열");
	 * 원래 문자열에서 찾을 문자열을 검색하여 바꿀 문자열로 치환한다.
	 * 치환한 새로운 문자열을 반환한다.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int i=0, count =0;
		int len = s.length();
		
		while(i<len) {
			//3글자일때
			if( (i+2 < len) &&
			   s.charAt(i) == 'd' &&
			   s.charAt(i+1) == 'z' &&
			   s.charAt(i+2) == '=' ) {
				  count++;
				  i += 3;
				  continue;
			  }
		//2글자일때
		//char a = s.charAt(i), b = s.charAt(i+1);
		
		if(i+1 < len) {
			String str = s.charAt(i) + "" + s.charAt(i+1);
			if(str.equals("c=") ||
					   str.equals("c-") ||
			           str.equals("d-") ||
			           str.equals("lj") ||
			           str.equals("nj") ||
			           str.equals("s=") ||
			           str.equals("z=")) {
				count++;
				i+=2;
				continue;
			}
			
		}
		//1글자일 때
		count++;
		i++;
				
		}
		System.out.println(count);

	}

}
