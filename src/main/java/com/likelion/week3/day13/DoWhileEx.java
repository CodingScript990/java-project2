package com.likelion.week3.day13;

import java.util.Scanner;

public class DoWhileEx {
		public static void main(String[] args) {

				// Scanner 인스턴스화
				Scanner sc = new Scanner(System.in);

				int inputNum;

				// do - while
				// 무한 루프
				do {
						System.out.print("짝수를 입력하세요 : ");
						inputNum = sc.nextInt();
				} while (inputNum % 2 != 0);
				System.out.printf("올바른 짝수가 입력되었습니다.\n");
				System.out.printf("%d\n", inputNum);
		}
}
