package com.likelion.codeup.week2.day9;

import java.util.Scanner;

public class CodeUp1059 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type input
				int bitOne = sc.nextInt();

				// int type => bit operator[>>]
				int result = bitOne>>0;

				// output
				System.out.printf("%d\n", ~result);
		}
}
