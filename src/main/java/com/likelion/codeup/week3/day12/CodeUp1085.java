package com.likelion.codeup.week3.day12;

import java.util.Scanner;

public class CodeUp1085 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				long inputH, inputB, inputC, inputS;

				inputH = sc.nextLong();
				inputB = sc.nextLong();
				inputC = sc.nextLong();
				inputS = sc.nextLong();

				long bit = inputH * inputB * inputC * inputS; // bit
				float result = bit / 1024.0f / 1024.0f / 8.0f;

				System.out.printf("%.1f MB\n", result);
		}
}
