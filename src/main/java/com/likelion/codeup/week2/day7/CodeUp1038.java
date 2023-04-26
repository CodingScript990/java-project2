package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1038 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				String[] sArr = sc.nextLine().split(" ");

				long iBlank1 = Long.parseLong(sArr[0]);
				long iBlank2 = Long.parseLong(sArr[1]);

				long result = iBlank1 + iBlank2;

				System.out.printf("%d", result);
		}
}
