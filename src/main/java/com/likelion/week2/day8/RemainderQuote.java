package com.likelion.week2.day8;

public class RemainderQuote {
		public static void main(String[] args) {
				// int 초기값
				int iVal = 1;

				// output
				System.out.println(iVal / 2); // 0

				// int [a, b] 초기값
				int a = 10;
				int b = 3;

				// 몫, 나머지 => 고유한 값

				// 몫
				int quote = a / b; // 10 / 3

				// 나머지
				int remainder = a % b; // 10 %% 3

				// output
				System.out.printf("10을 3으로 나눈 몫은 %d이고 나머지는 %d이다.", quote, remainder); // 3, 1

		}
}
