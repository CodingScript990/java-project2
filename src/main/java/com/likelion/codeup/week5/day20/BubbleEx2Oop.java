package com.likelion.codeup.week5.day20;

import java.util.Arrays;

public class BubbleEx2Oop {
		public int[] smallSortARound(int[] arr) {
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
				return arr;
		}
		public static void main(String[] args) {

				// 가장 작은 수가 오는 버블정렬

				BubbleEx2Oop bubbleEx2Oop = new BubbleEx2Oop();

				int[] arr = {7,2,3,9,28,11};

				bubbleEx2Oop.smallSortARound(arr);

				System.out.println("arr : " + Arrays.toString(arr));
		}
}
