package com.likelion.codeup.week5.day20;

import java.util.Arrays;

public class BubbleEx2 {
		public static void main(String[] args) {

				// 가장 작은 수가 오는 버블정렬

				int[] arr = {7,2,3,9,28,11};

				for (int i = 0; i < arr.length - 1; i++) {
						for (int j = 1; j < arr.length; j++) {
								if (arr[i] > arr[j]) {
										// swap value
										int temp = arr[i];
										arr[i] = arr[j];
										arr[j] = temp;
								}
						}
				}

				System.out.println("arr : " + Arrays.toString(arr));
		}
}
