package com.kh.example.oop3;

public class Run {

	public static void main(String[] args) {
		//기본 생성자로 객체 생성
		Book2 b1 = new Book2();
		b1.inform();
		
		System.out.println("-----------------------------------------");
		
		Book2 b2 = new Book2("신나는 자바", "KH", "최지원");
		b2.inform();
		
		System.out.println("-----------------------------------------");
		Book2 b3 = new Book2("스프링의 기초", "한빛","김수민", 55000, 0.3);
		b3.inform();
		
		
		

	}

}
