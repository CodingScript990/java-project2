package com.likelion.codeup.week3.day14;

import java.util.Scanner;

public class CodeUp1094 {
		public static void main(String[] args) {

				// 배열 거꾸로 출력

				Scanner sc = new Scanner(System.in);

				int inputN = sc.nextInt();

				int[] firstArr = new int[inputN];
				int idx = 0;

				for (int i = 0; i < inputN; i++) {
						firstArr[idx++] = sc.nextInt();
				}

				for (int i = firstArr.length - 1; i >= 0; i--) {
						System.out.printf("%d ", firstArr[i]);
				}
		}
}
