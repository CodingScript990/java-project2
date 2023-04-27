package com.likelion.codeup.week2.day9;

import java.util.Scanner;

public class CodeUp1053 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type setting
				int opNum = 1;

				// int type input
				int iInput = sc.nextInt();

				// result  => 삼항 연산자 사용
				int result = iInput == opNum ? 0 : 1;

				// output
				System.out.printf("%d\n", result);
		}
}
