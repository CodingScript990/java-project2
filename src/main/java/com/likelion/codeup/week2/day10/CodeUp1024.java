package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1024 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// string type input
				String[] inputStr = sc.nextLine().split("");

				// for Statement
				for (String oneStr : inputStr) {
						// output
						System.out.printf("'%s'\n",oneStr);
				}
		}
}
