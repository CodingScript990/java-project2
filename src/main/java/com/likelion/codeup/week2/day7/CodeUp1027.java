package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1027 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				String[] dateTime = sc.nextLine().split("\\.");

				int year = Integer.parseInt(dateTime[0]);
				int month = Integer.parseInt(dateTime[1]);
				int day = Integer.parseInt(dateTime[2]);

				System.out.printf("%02d-%02d-%04d", day, month, year);

		}
}
