package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");//shape2
		System.out.println("================");
		
		Triangle t1 = new Triangle();//tri0     //shape0 tri0
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);//tri2    //shape2 tri2
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);//shape2 tri4
		System.out.println("================");
		
	}

}

