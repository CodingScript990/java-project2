package com.likelion.codeup.week3.day11;

import java.util.Scanner;

public class CodeUp1080 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();
				int inputSum = 0;

				for (int i = 1; i <= inputNum; i++) {
						inputSum += i;
						if (inputSum >= inputNum) {
								System.out.printf("%d\n", i);
								break;
						}
				}
		}
}
