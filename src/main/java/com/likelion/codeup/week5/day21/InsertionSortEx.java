package com.likelion.codeup.week5.day21;

import java.util.Arrays;

public class InsertionSortEx {
		public static void main(String[] args) {
				
				// 삽입정렬 점화식

				int[] arr = {7,2,3,9,28,11};

				// i  j j-1
				// 1  1  0
				// 2  2  1
				// 2  1  2
				// 3  3  2
				// 3  2  1
				// 3  1  0
				for (int i = 1; i < arr.length; i++) {
						// j가 0까지 빼줍니다
						for (int j = i; j > 0; j--) {
								// 튜닝
								// i번째까지 올 동안 해당 숫자 set은 오름차순으로 정렬이 되어 있기 때문에 교환을 못하는 상태가 오면 그 다음번도 역시 교환을 못하는 상태가 됩니다.
								System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
								// if
								if (arr[i] < arr[j - 1]) {
										int temp = arr[j];
										arr[j] = arr[j - 1];
										arr[j - 1] = temp;
								} else {
										// 교환 안될때 break 를 합니다
										break;
								}
						}
				}
				// 정렬 결과
				System.out.println(Arrays.toString(arr));
		}
}
