package com.likelion.week2.day9;

public class ComparisonOperatorEx {
		public static void main(String[] args) {

				// int type 초기값 설정
				int iVal1 = 10;
				int iVal2 = 20;

				// output[비교 연산자]
				// [공식] -> [피연산자] [연산자] [피연산자]
				// == Operator[10 == 20]
				System.out.printf("iVal1 == iVal2 --> %b\n", iVal1 == iVal2); // False
				// != Operator[10 != 20]
				System.out.printf("iVal1 != iVal2 --> %b\n", iVal1 != iVal2); // True
				// < Operator[10 < 20]
				System.out.printf("iVal1 < iVal2 --> %b\n", iVal1 < iVal2); // True
				// <= Operator[10 <= 20]
				System.out.printf("iVal1 <= iVal2 --> %b\n", iVal1 <= iVal2); // True
				// > Operator[10 > 20]
				System.out.printf("iVal1 > iVal2 --> %b\n", iVal1 > iVal2); // False
				// >= Operator[10 >= 20]
				System.out.printf("iVal1 >= iVal2 --> %b\n", iVal1 >= iVal2); // False
		}
}
