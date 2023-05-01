package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1073 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();

				for (int i = 0; inputNum != 0; i++) {
						System.out.printf("%d\n", inputNum);
						inputNum = sc.nextInt();
				}
		}
}
