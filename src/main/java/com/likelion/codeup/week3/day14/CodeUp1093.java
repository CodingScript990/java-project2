package com.likelion.codeup.week3.day14;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1093 {
		public static void main(String[] args) {

				// 배열 공간을 잘 활용하냐 모르냐!

				Scanner sc = new Scanner(System.in);

				int inputN = sc.nextInt();

				int[] outputArr = new int[23 + 1]; // 1 ~ 23

				for (int i = 0; i < inputN; i++) {
						outputArr[sc.nextInt()]++; // 핵심!
				}

				for (int i = 1; i < outputArr.length; i++) {
						System.out.printf("%d ", outputArr[i]);
				}
		}
}
