
package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1120 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// float type initial value
				float inputOne = sc.nextFloat();
				float inputTwo = sc.nextFloat();
				float inputThird = sc.nextFloat();

				// float operator => sum
				float total = inputOne + inputTwo + inputThird;

				// float operator => division
				float result = total / 3;

				// output
				System.out.printf("%.2f\n", result);
		}
}
