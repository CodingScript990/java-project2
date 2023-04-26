package com.likelion.week2.day8;

import java.util.Arrays;

public class TwoDimArrSetValue {
		// Array 생성 Refactoring
		public static void printTwoDimArr(int[][] arr) { // 2차원 배열 생성 parameter[arr]
				// output
				System.out.println("arr[0]" + Arrays.toString(arr[0]));
				System.out.println("arr[1]" + Arrays.toString(arr[1]));
				System.out.println("arr[2]" + Arrays.toString(arr[2]));
				System.out.println("arr[3]" + Arrays.toString(arr[3]));
				System.out.println("arr[4]" + Arrays.toString(arr[4]));
		}
		// 가로 배열 => 행
		public static void rowArr(int[][] arr, int rowNum) { // parameter[arr, rowNum]

				// 가로 index[2]열
				arr[rowNum][0] = 1;
				arr[rowNum][1] = 1;
				arr[rowNum][2] = 1;
				arr[rowNum][3] = 1;
				arr[rowNum][4] = 1;

				// comment
				System.out.println("2차원 배열 rowArr 에 값을 넣은 후 결과물");

				// Refactoring => 2차원 배열
				printTwoDimArr(arr);

		}

		// 세로 배열 => 열
		public static void columnArr(int[][] arr2, int columnNum) { // parameter[arr2, columnNum]
				// 세로 index[2]행
				arr2[0][columnNum] = 1;
				arr2[1][columnNum] = 1;
				arr2[2][columnNum] = 1;
				arr2[3][columnNum] = 1;
				arr2[4][columnNum] = 1;

				// comment
				System.out.println("2차원 배열 columnArr 에 값을 넣은 후 결과물");

				// Refactoring => 2차원 배열
				printTwoDimArr(arr2);
		}

		public static void main(String[] args) {

				// int 2차원 배열 5X5
				int[][] arr = new int[5][5];

				// output => row index[2]
				rowArr(arr, 2);

				// comment => 구분선
				System.out.println();

				// int 2차원 배열 5X5
				int[][] arr2 = new int[5][5];

				// output => column index[2]
				columnArr(arr2, 2);
		}
}
