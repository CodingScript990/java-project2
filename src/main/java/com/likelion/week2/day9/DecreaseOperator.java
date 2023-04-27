package com.likelion.week2.day9;

public class DecreaseOperator {
		public static void main(String[] args) {
				
				// int type 초기값 설정
				int i = 10;

				// 증감 연산자 전
				System.out.printf("i:%d\n", i); // 10

				// comment
				System.out.println("\n↑ 증감연산자 전 ↓ 증감연산자 후\n");
				
				// 증감 연산자 => --
				i--; // 10 - 1

				// 증감 연산자 후
				System.out.printf("i:%d\n", i); // 9
		}
}
