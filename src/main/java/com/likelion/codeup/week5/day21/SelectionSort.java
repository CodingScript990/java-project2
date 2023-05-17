package com.likelion.codeup.week5.day21;

import java.util.Arrays;

public class SelectionSort {
		public static void main(String[] args) {
				// 선택정렬
				
				// 핵심 로직 구현

				int[] arr = {7, 2, 3, 9, 28, 11};

				int targetValue = arr[0];
				int targetIndex = 0;

				for (int i = 0; i < arr.length; i++) {
						if (targetValue > arr[i]) {
								targetValue = arr[i];
								targetIndex = i;
						}
				}
				// swap
				int temp = arr[0];
				arr[0] = arr[targetIndex];
				arr[targetIndex] = temp;

				System.out.println(Arrays.toString(arr));
		}
}
