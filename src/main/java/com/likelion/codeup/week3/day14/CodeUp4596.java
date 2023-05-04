package com.likelion.codeup.week3.day14;

import java.util.Scanner;

public class CodeUp4596 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int[][] arr = new int[10][10];
				int xIdx = 0;
				int yIdx = 0;

				int maxValue = 0;

				// O(N^2) => 중첩일때~!
				for (int row = 1; row < arr.length; row++) {

						for (int col = 1; col < arr.length; col++) {

								int now = sc.nextInt();

								if (maxValue < now) {
										maxValue = now;
										xIdx = col;
										yIdx = row;
								}
						}
				}
				System.out.println(maxValue);
				System.out.printf("%d %d\n", yIdx, xIdx);
		}
}
