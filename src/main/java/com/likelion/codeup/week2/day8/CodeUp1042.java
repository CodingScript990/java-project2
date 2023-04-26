package com.likelion.codeup.week2.day8;

import java.util.Scanner;

public class CodeUp1042 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int iVal1 = sc.nextInt();
				int iVal2 = sc.nextInt();

				int remainder = iVal1 / iVal2;

				System.out.printf("%d", remainder);
		}
}
