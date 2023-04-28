
package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1116 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int inputOperOne = sc.nextInt();
				int inputOperTwo = sc.nextInt();

				// int type operator[+, -, *, /]
				int sum = inputOperOne + inputOperTwo;
				int minus = inputOperOne - inputOperTwo;
				int multiplication = inputOperOne * inputOperTwo;
				int division = inputOperOne / inputOperTwo;

				// output
				System.out.printf("%d+%d=%d\n", inputOperOne, inputOperTwo, sum);
				System.out.printf("%d-%d=%d\n", inputOperOne, inputOperTwo, minus);
				System.out.printf("%d*%d=%d\n", inputOperOne, inputOperTwo, multiplication);
				System.out.printf("%d/%d=%d\n", inputOperOne, inputOperTwo, division);
		}
}
