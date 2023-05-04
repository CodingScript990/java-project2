package com.likelion.codeup.week3.day14;

import java.util.Scanner;

public class CodeUp1099 {

		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				// 10 X 10 배열
				int[][] inputArr = new int[10][10];

				// 배열 생성
				for (int i = 0; i < 10; i++) {
						for (int j = 0; j < 10; j++) {
								// 배열 입력 받는 것까지 완료!
								inputArr[i][j] = sc.nextInt();
						}
				}

				// 개미가 떨어져서 시작되게 해야해서
				// 이동하면서 찍을지 이동하고 찍을지
				int yIdx = 1; // y값
				int end = 0; // 종료

				// 개미 이동
				for (int i = 1;  i < inputArr.length; i++) {

						if (end != 1) {

								for (int j = yIdx; j < inputArr.length; j++) {

										if (inputArr[i][j] == 0) {
												inputArr[i][j] = 9;
										} else if (inputArr[i][j] == 2) {
												inputArr[i][j] = 9;
												end = 1;
												break;
										} else {
												yIdx = j - 1;
												break;
										}
								}
						} else {
								break;
						}
				}

				// 배열 출력
				for (int i = 0; i < inputArr.length; i++) {
						for (int j = 0; j < inputArr.length; j++) {
								System.out.printf("%d ", inputArr[i][j]);
						}
						System.out.println();
				}
		}
}
