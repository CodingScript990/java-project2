package com.likelion.codeup.week3.day14;

import java.util.Scanner;

public class CodeUp1096 {
		public static void main(String[] args) {

				//

				Scanner sc = new Scanner(System.in);

				int inputN = sc.nextInt();

				int[][] arr = new int[19][19];

				int xIdx, yIdx;

				for (int i = 0; i < inputN; i++) {
						xIdx = sc.nextInt();
						yIdx = sc.nextInt();

						// 해당되면 1
						arr[xIdx - 1][yIdx - 1] = 1;
				}

				// O(N^2) => 중첩일때~! 19  x 19 => 5는 흰돌 1-5까지 1이 들어감!
				for (int j = 0; j < arr.length; j++) {

						for (int k = 0; k < arr.length; k++) {
								System.out.print(arr[j][k] + " ");
						}
						System.out.println();
				}
		}
}
