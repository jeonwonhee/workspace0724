package com.kh.example.oop4;

import com.kh.example.oop3.Book2;

public class SquareController {
	//필드
	//shape를 기본생성자로 생성
	private Shape s = new Shape();
	
	//매서드
	public double calcPerimeter(double height, double width) {
		s = new Shape(4,height, width); //todo 타입 알 수 없음
		 return s.getWidth() * 2 + s.getHeight() * 2;
		 
	 }
	
	public double calcArea(double height, double width) {
		 s = new Shape(0,height, width); //todo 타입 알 수 없음
		 return s.getWidth() *  s.getHeight() ;
		 
	 }
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "사각형 " + s.information() ;
	}

}
