package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1026 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				String[] dateTime = sc.nextLine().split(":");

				int minute = Integer.parseInt(dateTime[1]);

				System.out.println(minute);
		}
}
