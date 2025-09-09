package com.kh.example.oop4;

public class Shape {
	//필드
	private int type;
	private double height;
	private double width;
	private String color ="white"; //기본값이 white
	
	public Shape() {
		super();
	}

	
	
	//필드 초기화 생성자
	 public Shape(int type, double height, double width) {
	        this.type = type;
	        this.height = height;
	        this.width = width;
	 }
	 
	 //Getter, Setter

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Getter, Setter
	public String information() {
		return height + " " + width + " " + color;

}
}
