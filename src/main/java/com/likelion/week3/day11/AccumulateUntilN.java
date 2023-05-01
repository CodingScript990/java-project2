package com.likelion.week3.day11;

import java.util.Scanner;

public class AccumulateUntilN {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();
				int inputSum = 0;

				for (int i = 1; i <= inputNum; i++) {
						inputSum += i;
				}
				// output
				System.out.printf("%d\n", inputSum);
				// 0 + 1 = 1
				// 1 + 2 = 3
				// 3 + 3 = 6
				// 6 + 4 = 10
				// 10 + 5 = 15
				// 15 + 6 = 21
				// 21 + 7 = 28
				// 28 + 8 = 36
				// 36 + 9 = 45
				// 45 + 10 = 55
		}
}
