package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1035 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 16진수로 입력 받고,
				// 16진수로 입력 받는다는 뜻
				// hexadecimal : 16진수
				int hexadecimal = Integer.parseInt(sc.nextLine(), 16);

				// 8진수로 변환하여 출력해주는 단계
				// 16진수를 8진수로 변환해서 출력받겠다는 의미
				// octal : 8진수
				String octal = Integer.toOctalString(hexadecimal);

				// output
				System.out.println(octal);
		}
}
