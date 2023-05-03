package com.likelion.week3.day13;

public class BreakEx3 {
		public static void main(String[] args) {

				// i^2 < 50 인 i

				for (int i = 0; i < 100; i++) {

						System.out.printf("i:%d\n", i);

						if (i * i > 50) {
								break;
						}
				}
		}
}
