package com.kh.example.api;

import java.util.StringTokenizer;
public class TokenController {

	//기본생성자
	public TokenController() {
		super();
	}
	
	//매서드
	//공백을 토큰으로 처리하여 띄어쓰기를 제거한 문자열 반환
	//StringTokenizer는 문자열을 특정 구분자(여기서는 " ", 즉 공백) 기준으로 잘라주는 클래스
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " "); 
		
	//문자열을 효율적으로 이어 붙일 수 있게 도와주는 StringBuilder 객체 생성.
		StringBuilder sb = new StringBuilder();
		
	//st.hasMoreTokens() → 아직 꺼내지 않은 토큰이 있으면 true, 없으면 false.
    //즉, str을 공백으로 잘라낸 조각들이 다 꺼내질 때까지 반복문 실행.
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
			//st.nextToken() → 토큰(잘려진 문자열 조각)을 하나 꺼냅니다.
			//sb.append(...) → 꺼낸 토큰을 StringBuilder에 붙여 나갑니다.
		}
		return sb.toString();
	}
	
	//첫글자만 대문자로 바꿔서 반환
	public String firstCap(String input) {
		char first = input.toUpperCase().charAt(0);
		return first + input.substring(1);
		
	}
	
	//one이 몇개 포함되어 있는지 개수를 세어 반환
	public int findChar(String input, char one) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}

}
