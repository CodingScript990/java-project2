package com.likelion.codeup.week3.day12;

import java.util.Scanner;

public class CodeUp1620 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine(); // 1234567
				int sum = 0; // 0
				for (int i = 0; i < input.length(); i++) { // length : 1234567
						sum += input.charAt(i) - '0'; // 28
						//  sum : 1+2+3+4+5+6+7 = 28
				}
				while (sum >= 10) { // 1. 28[sum] >= 10[true] // 2. 10[sum] >= 10[true]
						int newSum = 0; // 0
						while (sum != 0) { // 1. 28[sum] != 0[true] // 2. 10[sum ] >= 0[true]
								newSum += sum % 10;
								// 1. 28 % 10 => newSum[8](sum[2]) + newSum[2](sum[0])
								// 2. 10 % 10 => newSum[0]
								// 3. 0 % 10 => newSum[1]
								sum /= 10; // 1. sum[0] // 2. sum[1]
						}
						sum = newSum; // sum[0] = newSum[1]
				}
				System.out.println(sum); // sum[1]
		}
}
