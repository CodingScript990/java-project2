package com.likelion.codeup.week2.day8;

import java.util.Scanner;

public class CodeUp1046 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int operatorOne = sc.nextInt();
				int operatorTwo = sc.nextInt();
				int operatorThird = sc.nextInt();

				int operatorSum = operatorOne + operatorTwo + operatorThird;
				double operatorAverage = (double)operatorSum / 3;

				System.out.printf("%d\n", operatorSum);
				System.out.printf("%.1f\n", operatorAverage);
		}
}
