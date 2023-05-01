package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1078 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();
				int inputSum = 0;

				for (int i = 1; i <= inputNum; i++) {
						if (i % 2 == 0) {
								inputSum += i;
						}
				}
				System.out.printf("%d\n", inputSum);
		}
}
