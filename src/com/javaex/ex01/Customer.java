package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	public Customer() {
		super();
	}
	public Customer(String name,String hp,int cNo, int point) {
		super(name,hp);
		this.cNo = cNo;
		this.point = point;
	}
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + "]";
	}
	public void showInfo() {
		System.out.println("#이름:" + getName() + ", #핸드폰:" + getHp() + ", #고객번호:" + this.cNo + ", #포인트점수:" + this.point);
	}
	
	
	
	

	
}
