package com.likelion.week2.day9;

public class Accumulate687Compound {
		public static void main(String[] args) {

				// int 초기값 설정
				int num = 687;
				// 대입연산자 초기값 설정
				int answer = 0;

				// 1 나머지 2 몫
				answer += num % 10; // 68 [answer = 7]
				num /= 10; // 68

				answer += num % 10; // 6 [answer = 15(7 + 8)]
				num /= 10; // 6

				answer += num % 10; // 0 [answer = 21(15 + 6)]
				num /= 10; // 0

				// output
				System.out.printf("answer:%d\n", answer); // 21
		}
}
