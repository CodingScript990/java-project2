package com.likelion.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);
				// [output]2와 3을 더하면 5입니다
				// Variable => val1, val2 초기화
				int val1 = sc.nextInt();
				int val2 = sc.nextInt();

				// output => variable
				// System.out.println(val1 + val2);

				// output => Formatting
				System.out.printf("%d와 %d을 더하면 %d입니다.", val1, val2, (val1+val2));
		}
}
