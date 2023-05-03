package com.likelion.week3.day13;

public class GreatestCommonDivisor {
		public static void main(String[] args) {

				// 최대 공약수
				int gcdNumOne = 20;
				int gcdNumTwo = 30;

				int gcdMax = 0;

				while (gcdNumTwo != 0) {
						gcdMax = gcdNumOne % gcdNumTwo;
						gcdNumOne = gcdNumTwo;
						gcdNumTwo = gcdMax;
				}
				System.out.println(gcdNumOne);
		}
}
