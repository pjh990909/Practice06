package com.javaex.ex02;

public class Triangle extends Shape {

	private int width;
	private int height;

	public Triangle() {
		System.out.println("Triange0");
	}

	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("Triange2");
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triange4");
	}

}
