package com.likelion.week3.day12;

import java.util.Scanner;

public class Factorial {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int factorialN = sc.nextInt(); // sc.nextIn();
				int answer = 1; // 0으로 하면 안됨![곱셈 연산은 0 (X)]

				// +=, *= 등 연산기호 가능
				for (int i = factorialN; i > 0; i--) {
//						System.out.printf("%d\n", i);
						answer *= i;
				}
				System.out.printf("answer:%d\n", answer);
		}
}
