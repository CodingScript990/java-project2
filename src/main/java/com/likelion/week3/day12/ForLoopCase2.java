package com.likelion.week3.day12;

public class ForLoopCase2 {
		public static void main(String[] args) {

				// Math.sqrt()

				int iSum = 1;

				for (int i = 2; i * i <= 50; i++) {
						iSum = i * i;
						System.out.printf("i:%d iSum:%d\n", i, iSum);
						/*
								2 * 2 = 4
								3 * 3 = 9
								4 * 4 = 16
								5 * 5 = 25
								6 * 6 = 36
								7 * 7 = 49
						*/
				}
		}
}
