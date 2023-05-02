package com.likelion.week3.day12;

public class ZeroOrFive {
		public static boolean isZeroOrFive(int num) {
				// while statement
				while(num > 0) {
						if (num % 10 != 5 && num % 10 != 0) {
								return false;
						}
						//
						num /= 10;
				}
				return true;
		}
		public static void main(String[] args) {

				int num = 252;
				// 10으로 나눈 나머지가 5로 나누었을 때 0 or 5인지 check

				boolean r = isZeroOrFive(num);
				System.out.printf("%b\n", r);
		}
}
