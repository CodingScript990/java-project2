package com.likelion.week2.day8;

import java.util.Arrays;

public class TwoDimArrEx {
		// Method Refactoring => method, function
		public static void printArray(int[][] arr) { // parameter(int[][] arr)
				// comment
				System.out.println("Refactoring 한 후 2차열 배열에 값을 넣고 출력한 결과 값");
				// output
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
		}
		public static void main(String[] args) {

				// int array 2차배열 선언
				int[][] arr = new int[3][3];

				// comment
				System.out.println("2차원 배열 intArr 선언 초기값");
				// output
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]) + "\n");

				// 각 index 방에 값을 할당
				arr[0][0] = 1; // 0 X 0 => 1
				arr[0][2] = 2; // 0 X 2 => 2
				arr[1][0] = 3; // 1 X 0 => 3

				// comment
				System.out.println("2차원 배열 intArr 에 값을 넣은 후 결과물");
				// output
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));

				// Refactoring 전 후 구분선
				System.out.println("\n↑ [Refactoring 전] ↓ [Refactoring 후]\n");

				// 각 index 방에 값을 할당
				arr[1][1] = 5; // 1 X 1 = > 5

				// output
				// Refactoring 하면 코드가 간결하고 유지보수도 쉬움![추상화]
				printArray(arr);
		}
}
