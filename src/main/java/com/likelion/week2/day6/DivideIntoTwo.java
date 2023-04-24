package com.likelion.week2.day6;

public class DivideIntoTwo {
		public static void main(String[] args) {
				// 1 + 1 / 2

				// float type
				float fOne = 1;
				float fTwo = 2;

				// output
				System.out.printf("%.1f\n", fOne + fOne / fTwo); // 1.500000

				// int type
				int iOne = 1;
				int iTwo = 2;

				// output
				System.out.printf("%d\n", iOne + iOne / iTwo); // 1
				System.out.printf("%d\n", 9 / 2); // int result
				System.out.printf("%f\n", 9 / 2.0); // float result
				// type 을 변환해서 계산을 하기도 함![주의]
		}
}
