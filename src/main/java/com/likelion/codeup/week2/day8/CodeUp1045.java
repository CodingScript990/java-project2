package com.likelion.codeup.week2.day8;

import java.util.Scanner;

public class CodeUp1045 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int operator1 = sc.nextInt();
				int operator2 = sc.nextInt();

				int plus = operator1 + operator2;
				int minus = operator1 - operator2;
				int multiply = operator1 * operator2;
				int quote = operator1 / operator2;
				int remainder = operator1 % operator2;
				double result = (double)operator1 / operator2;

				System.out.printf("%d\n", plus);
				System.out.printf("%d\n", minus);
				System.out.printf("%d\n", multiply);
				System.out.printf("%d\n", quote);
				System.out.printf("%d\n", remainder);
				System.out.printf("%.2f", result);
		}
}
