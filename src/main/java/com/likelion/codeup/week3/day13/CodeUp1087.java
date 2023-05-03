package com.likelion.codeup.week3.day13;

import java.util.Scanner;

public class CodeUp1087 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();

				int answer = 0;

				for (int i = 1; i <= inputNum; i++) {
						answer += i;

						if (answer >= inputNum) {
								break;
						}
				}
				System.out.printf("%d\n", answer);
		}
}
