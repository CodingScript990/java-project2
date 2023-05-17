package com.likelion.codeup.week5.day21;

import java.util.Arrays;

public class SelectionSortEx {
		public static void main(String[] args) {
				// 선택정렬
				
				//

				int[] arr = {7, 2, 3, 9, 28, 11};

				for (int j = 0; j < arr.length; j++) {
						int targetValue = arr[j];
						int targetIndex = j;
						for (int i = j + 1; i < arr.length; i++) {

								if (targetValue > arr[i]) {
										targetValue = arr[i];
										targetIndex = i;
								}
								// swap
								int temp = arr[j];
								arr[j] = arr[targetIndex];
								arr[targetIndex] = temp;
						}
				}

				System.out.println(Arrays.toString(arr));
		}
}
