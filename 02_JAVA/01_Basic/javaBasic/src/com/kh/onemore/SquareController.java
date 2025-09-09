package com.kh.onemore;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		return width*2 + height*2;
	}
	
	public double calcArea(double height, double width) {
		return width * height;
	}
	
	public void paintColor(String color) {
	    s.setColor(color);
	}
	
	public String print() {
		return "사각형" + s.information();
				
	}

}
