package com.kh.example.polymorphism;

public class Car {
	private String color;
	private String fuel;
	private int year;
	
	public Car() {
		super();
	}

	public Car(String color, String fuel, int year) {
		super();
		this.color = color;
		this.fuel = fuel;
		this.year = year;
	}

	@Override
	public String toString() {
		return color + ", " + fuel + ", " + year;
	}
	
	public void drive() {
		System.out.println("부릉부릉");
	}

}
