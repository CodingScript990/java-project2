package com.likelion.week3.day11;

public class MultiplicationTableStep3 {
		public static void main(String[] args) {

				// for statement = 2단 ~ 4단
				for (int i = 2; i < 5; i++) {
						for (int j = 1; j < 10; j++) {
								System.out.printf("%d * %d = %d\n", i, j, (i * j));
						}
						System.out.printf("----------\n");
				}
		}
}
