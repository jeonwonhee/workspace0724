package com.kh.example.oop4;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(3,height, width); //todo 타입 알 수 없음
		 return  s.getWidth() * 2 + s.getHeight() * 2;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(3,height, width);
		return s.getWidth() * s.getHeight();
	}


	public void paintColor(String color) {
		s.setColor(color);
		 
	 }
	public String print() {
		return "삼각형 " + s.information();
	}

}
