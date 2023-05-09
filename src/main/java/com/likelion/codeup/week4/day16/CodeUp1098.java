package com.likelion.codeup.week4.day16;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1098 {

		private int[][] arr;

		public CodeUp1098(int rowCnt, int colCnt) { // parameter[rowCnt, colCnt]
				// arr 의 rowCnt, colCnt 이 입력값을 받아와 생성준비를 해줌
				this.arr = new int[rowCnt][colCnt];
		}
		public void setBeam(int l, int d, int x, int y) { // parameter[l, direction, x, y]
				// loop[for] => arr [rowCnt][colCnt]
				for (int i = 0; i < l; i++) {
						// if statement
						if (d == 0) { // 가로
								arr[x - 1][y + i - 1] = 1;
						} else { // 세로
								arr[x + i - 1][y - 1] = 1;
						}
				}
		}

		public void printArr() {
				// loop[for]
				for (int i = 0; i < arr.length; i++) {
						// array 타입 i번째 값을 출력해줌[범위]
						System.out.println(Arrays.toString(arr[i]));
				}
		}

		public static void main(String[] args) {
				// 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.

				Scanner sc = new Scanner(System.in);

				// int 타입 입력값 셋팅
				int h = sc.nextInt();
				int w = sc.nextInt();

				int[][] board = new int[h][w];

				int n = sc.nextInt();

				for (int i=1; i<=n; i++) {
						int l = sc.nextInt();
						int d = sc.nextInt();
						int x = sc.nextInt();
						int y = sc.nextInt();

						for (int j = 0; j < l; j++) {
								if (d == 0) // 가로
										board[x-1][y-1+j] = 1;
								else
										board[x-1+j][y-1] = 1;
						}
				}

				for (int i = 0; i < h; i++) {
						for (int j = 0; j < w; j++) {
								System.out.print(board[i][j] + " ");
						}
						System.out.println();
				}
		}
}
