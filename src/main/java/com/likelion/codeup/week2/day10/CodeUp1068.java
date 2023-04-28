package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1068 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int inputScore = sc.nextInt();

				// if statement => 100
				if (inputScore <= 100) {
						// if statement => 90
						if (inputScore >= 90) {
								// output => A
								System.out.println("A");
								// else if => 89 or 70
						} else if (inputScore >= 89 || inputScore >= 70) {
								// output => B
								System.out.println("B");
								// else if => 69 or 40
						} else if (inputScore >= 69 || inputScore >= 40) {
								// output => C
								System.out.println("C");
								// else if => 39 or 0
						} else if (inputScore >= 39 || inputScore >= 0) {
								// output => D
								System.out.println("D");
						}
				}
		}
}
