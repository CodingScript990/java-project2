package com.likelion.codeup.week5.day20;

import java.util.Arrays;

public class BubbleEx {
		public static void main(String[] args) {
				// 버블 정렬[Bubble Sort] 튜닝1

				// Array type => int
				int[] arr = {7,2,3,9,28,11};

				for (int j = 1; j <= arr.length; j++) { // 1[2,3,7,9,28,11] 2[3,7],3[9,11],4[11,28],5[28],6[]
						// for statement
						for (int i = 0; i < arr.length - j; i++) { // arr.length - 1
								// if statement
 								if (arr[i] > arr[i + 1]) {
										// int type => arr[index]
										int temp = arr[i];

										arr[i] = arr[i + 1];
										arr[i + 1] = temp;
								}
						}
				}
				// output[last]
				// [2,3,7,9,11,28]
				System.out.println("arr[변경 후] : " + Arrays.toString(arr));
		}
}
