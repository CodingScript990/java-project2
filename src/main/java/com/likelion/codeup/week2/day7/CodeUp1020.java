package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1020 {
		
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 주민등록 번호를 입력받음!
				// 1234567-1234567
				String registration = sc.nextLine();

				// output => 특정 문자를 제거하고 나머지는 그대로 출력되도록 작업!
				// replace(method) : target 문자를 replacement 하여 변경해주는 것!
				System.out.printf("%s", registration.replace("-", ""));
		}
}
