package com.likelion.codeup.week4.day15;

import java.util.Scanner;

public class CodeUp1256 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				// int 타입 inputNumber => scanner 를 통해 정수타입을 받아와주는 작업
				int inputNumber = sc.nextInt();
				// String flagMsg => 별을 찍어주기 위해서 미리 초기화 작업
				String flagMsg = "";

				// for 문을 활용하여 별이 입력값 범위만큼 출력되도록 한다
				for (int i = 1; i <= inputNumber; i++) {
						// 초기화 해둔 String flagMsg 를 이용하여 별로 값을 채워준다
						flagMsg = "*";
						// String flagMsg 는 inputNumber 에서 입력된 값 만큼 출력해주고 범위에 도달하면 종료해주고
						// 범위만큼의 값을 터미널에 보여준다
						System.out.printf("%s", flagMsg);
				}
		}
}
