package com.likelion.codeup.week3.day13;

import java.util.Scanner;

public class CodeUp1089 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();
				int inputThird = sc.nextInt();

				int answer = inputOne;

				for (int i = 1; i < inputThird; i++) {
						answer += inputTwo;
				}
				System.out.printf("%d\n", answer);
		}
}
