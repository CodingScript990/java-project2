package com.likelion.codeup.week4.day15;

import java.util.Scanner;

public class CodeUp1287 {
		public static void main(String[] args) {
				// 값을 입력해주기 위한 작업을 한다
				Scanner sc = new Scanner(System.in);

				// int 타입으로 값을 받아와 주는 초기작업을 진행한다
				int inputNumber = sc.nextInt();
				// String 타입으로 값을 초기화를 해주는데 용도는 별을 출력해주기 위함이다
				String flagMsg = "";

				// for 문을 활용하여 별이 입력값 범위만큼 출력되도록 한다
				for (int i = 1; i <= 9; i++) {
						for (int j = 0; j < inputNumber * i; j++){
								// 초기화 해둔 String flagMsg 를 이용하여 별로 값을 채워준다
								flagMsg = "*";
								// String flagMsg 는 inputNumber 에서 입력된 값 만큼 출력해주고 범위에 도달하면 종료해주고
								// 범위만큼의 값을 터미널에 보여준다
								System.out.printf("%s", flagMsg);
						}
						System.out.println();
				}
		}
}
