package com.likelion.week4.day15;

public class StarPrintEx {
		public static void main(String[] args) {

				// 별찍기(직각 삼각형)
				int n = 4;

				for (int i = 1; i <= n; i++) {
						for (int j = 0; j < i; j++) {
								System.out.printf("*");
						}
						System.out.println("");
				}
		}
}
