
package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1121 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();

				// int type operator => remainder
				int result = inputOne % inputTwo;

				// output
				System.out.printf("%d\n", result);
		}
}
