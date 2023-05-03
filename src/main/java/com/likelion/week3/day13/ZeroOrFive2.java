package com.likelion.week3.day13;

public class ZeroOrFive2 {

		public static void main(String[] args) {

				// Method 안 쓰고 출력
				// int type initial value
				int num = 201;

				// String type initial value => setting
				String flagText = "0또는 5로만 이루어진 숫자입니다.";

				// while statement
				while (num > 0) { // condition
						// int type initial value => num 의 나머지값을 구해주는 setting
						int remainder = num % 10;

						// if statement => 5 or 0
						if (remainder % 5 != 0) flagText = "0또는 5로만 이루어진 숫자가 아닙니다."; break;

				}
				System.out.printf("%s\n", flagText);
		}
}
