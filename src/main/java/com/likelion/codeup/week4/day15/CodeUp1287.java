package com.likelion.codeup.week4.day15;

import java.util.Scanner;

public class CodeUp1287 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				int inputNumber = sc.nextInt();
				String flagMsg = "";

				for (int i = 1; i <= 9; i++) {
						for (int j = 0; j < inputNumber * i; j++){
								flagMsg = "*";
								System.out.printf("%s", flagMsg);
						}
						System.out.println();
				}
		}
}
