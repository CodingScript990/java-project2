package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1036 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// 10진수로 입력받고,
				// decimal : 10진수
				String decimal = sc.nextLine();

				// [아스키코드 값] => 10진수로 변환해줌
				// 아스키코드로 변환하여 값을 표현해주는 단계
				// ascii : 아스크코드
				int ascii = decimal.charAt(0);

				// output
				System.out.println(ascii);
		}
}
