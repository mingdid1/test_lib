package com.care.test;

public class TestClass {
	public static void main(String[] args) {
		
		// 첫번째 자료형이 대문자 => 클래스
		// int num; => 변수

		MemberClass m = new MemberClass();
		
		m.name = "홍길동";
		m.age = 20;
		
		System.out.println("이름 : " + m.name);
		System.out.println("나이 : "+ m.age);
		
		
		
		
	}
}
