package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1025 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// string type input
				String[] inputArr = sc.nextLine().split("");

				// for statement
				for (String unit : inputArr) {
						// if statement
						if (unit == inputArr[0]) {
								// True
								System.out.printf("[%s0000]\n", unit);
						} else if (unit == inputArr[1]) {
								System.out.printf("[%s000]\n", unit);
						} else if (unit == inputArr[2]) {
								System.out.printf("[%s00]\n", unit);
						} else if (unit == inputArr[3]) {
								System.out.printf("[%s0]\n", unit);
						} else if (unit == inputArr[4]) {
								System.out.printf("[%s]\n", unit);
						}
				}
		}
}
