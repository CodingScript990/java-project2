package com.likelion.codeup.week3.day13;

import java.util.Scanner;

public class CodeUp1092 {
		public static void main(String[] args) {

				// 최소공배수 학습 = GCD 공부
				Scanner sc = new Scanner(System.in);

				long inputOne = sc.nextLong();
				long inputTwo = sc.nextLong();
				long inputThird = sc.nextLong();

				boolean findDay = true;

				int day = 1;

				while (day % inputOne != 0 || day % inputTwo != 0 || day % inputThird != 0) {
						day++;
						if (day >= (Integer.MAX_VALUE)) {
								findDay = false;
								break;
						}
				}

				if (findDay) {
						System.out.printf("%d\n", day);
				}

		}
}
