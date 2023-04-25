package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1037 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 10진수로 값을 받고,
				// decimal : 10진수
				int decimal = sc.nextInt();

				// Char(10진수 => 아스키코드로 변환)
				// 아스키코드로 변환하여 출력해주는 작업
				// ascii : 아스크코드
				char ascii = (char)decimal;

				// output
				System.out.println(ascii);
		}
}
