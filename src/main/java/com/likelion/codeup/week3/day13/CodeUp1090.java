package com.likelion.codeup.week3.day13;

import java.util.Scanner;

public class CodeUp1090 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				long inputA = sc.nextLong();
				long inputR = sc.nextLong();
				long inputN = sc.nextLong();

				long answer = inputA;

				for (int i = 1; i < inputN; i++) {
						answer *= inputR;
				}
				System.out.printf("%d\n", answer);
		}
}
