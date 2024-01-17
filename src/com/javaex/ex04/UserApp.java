package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] user = new User[3];

		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		User u02 = new Customer("yjs", "y2345", "이효리", 2000);
		User u03 = new Employee("master", "m7788", "운영자", 5000000);

		user[0] = u01;
		user[1] = u02;
		user[2] = u03;

		for (int i = 0; i < user.length; i++) {
			user[i].showInfo();
		}
		int money = ((Employee) user[2]).salary;
		System.out.println("운영자의 월급은" + money + "원 입니다.");

	}

}
