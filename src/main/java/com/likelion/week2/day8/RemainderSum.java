package com.likelion.week2.day8;

public class RemainderSum {
		public static void main(String[] args) {

				// 나머지 값으로 합구하기 => 대입 연산자
				// Variable 초기값
				int num = 687;

				// First Remainder
				int firstRemainder = num % 10; // 687 % 10 = 68.7(얘를 들고감) => 7

				// 대입 연산자 => 연산된 곳에 값을 다시 할당한다는 의미
				num = num / 10; // 68 => 나머지 7 제외

				// Second Remainder
				int secondRemainder = num % 10; // 68 % 10 = 6.8(얘를 들고감) => 8

				// 대입 연산자
				num = num / 10; // 6 => 나머지 8 제외

				// Third Remainder
				int thirdRemainder = num % 10; // 6 % 10 = 0.6(얘를 들고감) => 6

				// output => 7 + 8 + 6 => 21
				System.out.println(firstRemainder + secondRemainder + thirdRemainder);
		}
}
