package com.likelion.week1.day5;

public class User {
		// Member variable =>  name, phoneNumber, age
		String name; // name -> String type
		String phoneNumber; // phoneNumber -> String type
		int age; // age -> int type

		// boolean method => 캡슐화하는 작업(Class method 를 이용하여 연산을 캡슐화함)
		boolean isAdult() {
				// 값을 반환 받을 때 조건을 달아줌! 즉, 값이 18 보다 크거나 같으면 true, 아니면 false 로 출력
				return age >= 18;
		}
}
