package com.likelion.codeup.week3.day12;

import java.util.Scanner;

public class CodeUp1086 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				long inputW, inputH, inputB;

				inputW = sc.nextLong();
				inputH = sc.nextLong();
				inputB = sc.nextLong();

				long bit = inputW * inputH * inputB; // bit
				float result = bit / 1024.0f / 1024.0f / 8.0f;

				System.out.printf("%.2f MB\n", result);
		}
}
