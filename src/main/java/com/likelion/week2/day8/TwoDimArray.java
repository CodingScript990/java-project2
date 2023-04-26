package com.likelion.week2.day8;

import java.util.Arrays;

public class TwoDimArray {
		public static void main(String[] args) {

				// 2차원 배열 선언
				int[][] arr = new int[3][3];
				// 2차원 배열에서 배열을 꺼내 1차원 배열이 됨
				int[] arrZero = arr[0];

				// 1차원 배열인 arrZero 에서 첫 번째 칸에 값을 할당함
				arrZero[0] = 1;

				// output
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
		}
}
