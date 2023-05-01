package com.likelion.week3.day11;

public class ForLoopForwardStepEx {
		public static void main(String[] args) {

				// for statement => 홀수만 출력
				for (int i = 0; i < 10; i++) { // initial; condition; increasing[+1];
						if (i % 2 != 0) { // 홀수값만 나오게!
								System.out.printf("%d\n", i); // 1,3,5,7,9
						}
				}
		}
}
