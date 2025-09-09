package com.kh.loop.pratice;

public class pratice1 {

	
	    public static void main(String[] args) {
	    	for (int i = 1; i <= 100; i++) {
	            // 7의 배수이면서 짝수인 경우를 제외하고 출력
	            if (!(i % 7 == 0 && i % 2 == 0)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}




