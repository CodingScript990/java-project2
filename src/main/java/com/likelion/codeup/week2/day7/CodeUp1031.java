package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1031 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 10진수를 입력받고,
				// octal : 8진수
				int decimal = sc.nextInt();

				// 8진수로 출력을 해주는 작업
				// decimal: 10진수
				String octal = Integer.toOctalString(decimal);

				// output
				System.out.println(octal);
		}
}
