package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1067 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// long type initial value
				long nestedInputOne = sc.nextLong();

				// if statement
				if (nestedInputOne > 0) {
						// output
						System.out.println("plus");
						// if statement => 2 == 0
						if (nestedInputOne % 2 == 0) {
								System.out.println("even");
						} else {
								System.out.println("odd");
						}
				} else { // else statement
						// output
						System.out.println("minus");
						// if statement => 2 == 0
						if (nestedInputOne % 2 == 0) {
								System.out.println("even");
						} else {
								System.out.println("odd");
						}
				}
		}
}
