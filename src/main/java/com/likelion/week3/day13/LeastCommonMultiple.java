package com.likelion.week3.day13;

public class LeastCommonMultiple {
		public static void main(String[] args) {

				// 최소 공배수
				int gcdNumOne = 20;
				int gcdNumTwo = 30;

				int gcdMax;
				int gcdMin = 0;

				if (gcdNumOne >= gcdNumTwo) {
						gcdMax = gcdNumOne;
				} else {
						gcdMax = gcdNumTwo;
				}

				for (int i = gcdMax; i >= gcdMax; i++) {
						if (i % gcdNumOne == 0 && i % gcdNumTwo == 0) {
								gcdMin = i;
								break;
						}
				}
				System.out.println(gcdMin);
		}
}
