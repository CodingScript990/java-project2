package com.likelion.codeup.week4.day15;

import java.util.Scanner;

public class CodeUp1256 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNumber = sc.nextInt();
				String flagMsg = "";

				for (int i = 1; i <= inputNumber; i++) {
						flagMsg = "*";
						System.out.printf("%s", flagMsg);
				}
		}
}
