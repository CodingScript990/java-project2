package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1081 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();

				for (int i = 1; i <= inputOne; i++) {
						for (int j = 1; j <= inputTwo ; j++) {
								System.out.printf("%d %d\n", i, j);
						}
				}
		}
}
