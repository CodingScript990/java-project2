package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1033 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 10진수를 입력 받고,
				// decimal : 10진수
				int decimal = sc.nextInt();

				// 16진수로 변환시켜주는 단계
				// hexadecimal : 16진수
				String hexadecimal = Integer.toHexString(decimal).toUpperCase();

				// output
				System.out.println(hexadecimal);
		}
}
