package com.likelion.codeup.week3.day14;

import java.util.Scanner;

public class CodeUp1095 {
		public static void main(String[] args) {

				// 최소값 구하기

				Scanner sc = new Scanner(System.in);

				int inputN = sc.nextInt();

				int[] firstArr = new int[inputN];
				int idx = 0;

				for (int i = 0; i < inputN; i++) {
						firstArr[idx++] = sc.nextInt();
				}

				int min = firstArr[0];

				for (int num : firstArr) {
						if (num < min) {
								min = num;
						}
				}
				System.out.printf("%d ", min);
		}
}
