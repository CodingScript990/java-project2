package com.likelion.week2.day9;

public class OrExampleEx {
		// Refactoring => boolean type[yearsOfExp, numOfProj 비교]
		public static boolean opPrint(int orFirst, int orTwo) { // Parameter[orFirst, orTwo]

				// Int type Initial value
				int orNumFirst = 5; // 5
				int orNumTwo = 10; // 10

				// return value => orFirst, orTwo
				// orFist => yearsOfExp
				// orTwo => numOfProj
				return orFirst > orNumFirst || orTwo > orNumTwo; // 8 > 5 || 12 > 10;
		}
		public static void main(String[] args) {

				// int type Initial value
				int yearsOfExp = 8; // 8
				int numOfProj = 12; // 12

				// boolean type => Check
				boolean isPromotion = opPrint(yearsOfExp, numOfProj); // return value 를 가리킴!

				// output
				// 8 > 5[True]
				// 12 > 10[True]
				System.out.printf("팀장 승진 여부: %b\n", isPromotion);
		}
}
