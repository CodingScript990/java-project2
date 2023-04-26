package com.likelion.week2.day8;

public class StringAccumulate {
		public static void main(String[] args) {

				// 문자열 누적하기
				// String variable 초기값
				String answer = ""; // ""

				// 대입 연산자
				answer += "쿵!"; // "" + "쿵!"

				// output
				System.out.println(answer); // "쿵!"

				// 대입 연산자
				answer += "짝!"; // "짝!" + "쿵!"

				// output
				System.out.println(answer); // 쿵!짝!
		}
}
