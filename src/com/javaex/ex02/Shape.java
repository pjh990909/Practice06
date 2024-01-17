package com.javaex.ex02;

public class Shape {

	private String fillColor;
	private String lineColor;

	public Shape() {
		System.out.println("Shape0");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape2");
	}

}
