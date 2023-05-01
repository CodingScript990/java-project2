package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1072 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();

				int[] inputValues = new int[inputNum];

				for (int i = 0; i < inputNum; i++) {
						inputValues[i] = sc.nextInt();
						System.out.printf("%d\n", inputValues[i]);
				}
		}
}
