package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1066 {
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
						System.out.println("even");
				} else if (inputIfOne % 2 == 1) {
						System.out.println("odd");
				}

				if (inputIfTwo % 2 == 0) {
						System.out.println("even");
				} else if (inputIfTwo % 2 == 1) {
						System.out.println("odd");
				}

				if (inputIfThird % 2 == 0) {
						System.out.println("even");
				} else if (inputIfThird % 2 == 1) {
						System.out.println("odd");
				}
		}
}
