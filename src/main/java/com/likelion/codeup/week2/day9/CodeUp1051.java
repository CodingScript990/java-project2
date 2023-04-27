package com.likelion.codeup.week2.day9;

import java.util.Scanner;

public class CodeUp1051 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type setting
				int iVal1 = sc.nextInt();
				int iVal2 = sc.nextInt();

				// result  => 삼항 연산자 사용
				int result = iVal2 >= iVal1 ? 1 : 0;

				// output
				System.out.printf("%d\n", result);
		}
}
