package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1034 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 8진수로 입력받고, 10진수로 변환하여 값을 표현해주는 단계
				// String type 으로 8진수의 값을 입력받음
				// octal : 8진수
				String octal = sc.nextLine();

				// String type[8진수] => 10진수로 변환하여 입력받음
				// decimal : 10진수
				int decimal = Integer.valueOf(octal, 8);
				// Input 을 종료
				sc.close();

				// output
				System.out.println(decimal);
		}
}
