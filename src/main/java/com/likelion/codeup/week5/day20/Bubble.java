package com.likelion.codeup.week5.day20;

import java.util.Arrays;

public class Bubble {
		public static void main(String[] args) {
				// 버블 정렬[Bubble Sort]

				// Array type => int
				int[] arr = {7,2,3,9,28,11};

				// [7,2,3,9,28,11]
				System.out.println("arr[변경 전] : " + Arrays.toString(arr));

				for (int i = 0; i < arr.length - 1; i++) {
						// for statement
						for (int j = 0; j < arr.length - 1; j++) {
								// if statement
								if (arr[i] > arr[i + 1]) {
										// int type => arr[index]
										int temp = arr[i];

										arr[i] = arr[i + 1];
										arr[i + 1] = temp;
								}
						}
						// output[statement]
						/*
								arr[0] : 2
								arr[1] : 3
								arr[2] : 7
								arr[3] : 9
								arr[4] : 11
						*/
						System.out.printf("arr[%d] : %d\n", i, arr[i]);
				}
				// output[last]
				// [2,3,7,9,11,28]
				System.out.println("arr[변경 후] : " + Arrays.toString(arr));
		}
}
