package com.likelion.week3.day13;

import java.util.Scanner;

public class OddNumberInput {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOdd;

				do {
						System.out.print("홀수를 입력 하세요:");

						inputOdd = sc.nextInt();

				} while (inputOdd % 2 == 0);
				System.out.printf("올라른 홀수가 입력되었습니다:%d\n", inputOdd);
		}
}
