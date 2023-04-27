package com.likelion.codeup.week2.day9;

import java.util.Scanner;

public class CodeUp1048 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type input
				// bit => 2진수 [0,1] Default(2^0 2의 0제곱)
				int bitOne = sc.nextInt();
				int bitTwo = sc.nextInt();

				// Bit Operator 사용
				int result = bitOne<<bitTwo;

				// output
				System.out.printf("%d\n", result);
		}
}
