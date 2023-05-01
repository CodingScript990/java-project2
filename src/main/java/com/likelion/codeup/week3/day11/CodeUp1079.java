package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1079 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				String[] inputStr = sc.nextLine().split(" ");

				for (String resultStr : inputStr) {
						System.out.printf("%s\n", resultStr);
						if (resultStr.equals("q")) {
								break;
						}
				}
		}
}
