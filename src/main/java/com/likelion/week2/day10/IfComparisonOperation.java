package com.likelion.week2.day10;

public class IfComparisonOperation {
		public static void main(String[] args) {

				// int initial value
				int age = 20;
				// boolean initial value
				boolean isAdult = age >= 18; // boolean type variable

				// if statement
				if (isAdult) { // variable 을 입력값으로 사용함
						System.out.println("성인 입니다.");
				}

				// if statement
				if (age < 18) { // 비교연산을 if statement 의 입력값으로 사용함
						System.out.println("미성년자 입니다.");
				}
		}
}
