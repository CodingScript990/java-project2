package com.likelion.codeup.week3.day13;

import java.util.Scanner;

public class CodeUp1091 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				long inputA = sc.nextLong();
				long inputM = sc.nextLong();
				long inputD = sc.nextLong();
				long inputN = sc.nextLong();

				long answer = inputA;

				for (int i = 1; i < inputN; i++) {
						answer *= inputM;
						answer += inputD;
				}
				System.out.printf("%d\n", answer);
		}
}
