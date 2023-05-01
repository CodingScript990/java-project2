package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1071 {
		public static void main(String[] args) {

				// new operator
				Scanner sc = new Scanner(System.in);

				// int type input initial value
				int inputNum = sc.nextInt();

				// for statement
				for (int i = 0; inputNum != 0; i++) {
						// output => initial value
						System.out.printf("%d\n", inputNum);
						// 대입연산 => int type value
						inputNum = sc.nextInt();
				}
		}
}
