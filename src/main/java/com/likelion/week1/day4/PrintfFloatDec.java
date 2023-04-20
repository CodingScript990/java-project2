package com.likelion.week1.day4;

public class PrintfFloatDec {
		public static void main(String[] args) {
				// 소수점 출력하기
				// double type 이여서 Error
				// System.out.printf("%d", 0.5f);
				// float type
				System.out.printf("%f", 0.5);
				System.out.printf("%.1f", 1.44);
				System.out.printf("%.2f", 3.78978);
				// Integer type 인데 float type output
				//System.out.printf("%f", 1 / 2);
		}
}
