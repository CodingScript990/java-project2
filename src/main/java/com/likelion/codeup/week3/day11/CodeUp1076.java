package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1076 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				char inputChar = sc.next().charAt(0);

				for (char c = 'a'; c <= inputChar; c++) {
						System.out.printf("%c\n", c);
				}
		}
}
