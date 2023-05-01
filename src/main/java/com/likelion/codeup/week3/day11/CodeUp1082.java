package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1082 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				String inputStr = sc.nextLine();

				int outputNum = Integer.valueOf(inputStr, 16);

				for (int i = 1; i < 16; i++) {
						String inputUpperCase = Integer.toHexString(i).toUpperCase();
						String resultUpperCase = Integer.toHexString(outputNum * i).toUpperCase();
						System.out.printf("%s * %s = %s\n", inputStr, inputUpperCase, (resultUpperCase));
				}
		}
}
