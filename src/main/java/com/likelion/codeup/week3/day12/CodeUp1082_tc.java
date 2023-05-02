package com.likelion.codeup.week3.day12;

import java.util.Scanner;

public class CodeUp1082_tc {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				String inputChar = sc.next();

				int iHaxVal = Integer.parseInt(inputChar, 16);

				for (int i = 1; i < 16; i++) {
						System.out.printf("%s*%X=%X\n", inputChar, i, iHaxVal * i);
				}
		}
}
