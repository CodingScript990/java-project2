package com.likelion.week3.day13;

public class FactorSum {
		public static void main(String[] args) {
				// 약수의 합

				int num = 12;

				int answer = 0;

				for (int i = 1; i <= num; i++) {

						System.out.printf("num:%d i:%d\n", num, i);

						if (num % i == 0) answer += i;
				}
				System.out.printf("answer:%d\n", answer);
		}
}
