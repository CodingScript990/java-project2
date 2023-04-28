package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1065 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int inputIfOne = sc.nextInt();
				int inputIfTwo = sc.nextInt();
				int inputIfThird = sc.nextInt();

				// if statement
				if (inputIfOne % 2 == 0) {
						// output
						System.out.printf("%d\n", inputIfOne);
				}

				// if statement
				if (inputIfTwo % 2 == 0) {
						// output
						System.out.printf("%d\n", inputIfTwo);
				}

				// if statement
				if (inputIfThird % 2 == 0) {
						// output
						System.out.printf("%d\n", inputIfThird);
				}
		}
}
