package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1072 {
		public static void main(String[] args) {

				// new operator
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int inputNum = sc.nextInt();

				// int array type value
				int[] inputValues = new int[inputNum];

				// for statement
				for (int i = 0; i < inputNum; i++) {
						// 대입연산[i] = new operator Object
						inputValues[i] = sc.nextInt();
						// output => int type array value[i]
						System.out.printf("%d\n", inputValues[i]);
				}
		}
}
