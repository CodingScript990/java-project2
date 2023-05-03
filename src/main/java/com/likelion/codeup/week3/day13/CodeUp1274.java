package com.likelion.codeup.week3.day13;

import java.util.Scanner;

public class CodeUp1274 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();

				int factors = 0;

				for (int i = 2; i < inputNum; i++) {

						if (inputNum % i == 0) factors++;
				}

				String result = factors == 0 ? "prime" : "not prime";

				System.out.printf("%s\n", result);
		}
}
