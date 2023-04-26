package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1032 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 10진수를 입력받고,
				// decimal : 10진수
				int decimal = sc.nextInt();

				// 16진수로 변환하여 출력을 해주는 작업
				// hexadecimal : 16진수
				String hexadecimal = Integer.toHexString(decimal);

				// output
				System.out.println(hexadecimal);
		}
}
