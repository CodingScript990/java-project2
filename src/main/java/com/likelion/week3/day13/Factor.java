package com.likelion.week3.day13;

import java.util.Scanner;

public class Factor {
		public static void main(String[] args) {
				// 약수 구하기

				Scanner sc = new Scanner(System.in);

				int num = sc.nextInt();

				for (int i = 1; i <= num; i++) {
						// System.out.printf("%d %% %d --> %d\n", num, i, num % i);
						if (num % i == 0) {
								System.out.printf("%d ", i);
						}
				}
		}
}
