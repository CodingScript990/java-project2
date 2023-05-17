package com.likelion.codeup.week5.day21;

import java.util.Arrays;

public class InsertionSortExOop {
		// desc --> 내림차순
		// asc --> 오름차순
		public int[] sort(int[] arr, boolean isAscending) {
				for (int i = 1; i < arr.length; i++) {
						// j가 0까지 빼줍니다
						for (int j = i; j > 0; j--) { // 내림차순 바꿀때!
								// 튜닝
								// i번째까지 올 동안 해당 숫자 set은 오름차순으로 정렬이 되어 있기 때문에 교환을 못하는 상태가 오면 그 다음번도 역시 교환을 못하는 상태가 됩니다.
								System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
								// if
								if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1])> 0) { // 내림차순
										int temp = arr[j];
										arr[j] = arr[j - 1];
										arr[j - 1] = temp;
								} else {
										// 교환 안될때 break 를 합니다
										break;
								}
						}
				}
				return arr;
		}

		// method 오버로딩!
		public int[] sort(int[] arr) {
				return sort(arr, true);
		}
		public static void main(String[] args) {
				
				// 삽입정렬 점화식

				InsertionSortExOop insertionSortExOop = new InsertionSortExOop();

				int[] arr = {7,2,3,9,28,11};

				arr = insertionSortExOop.sort(arr);

				// 정렬 결과
				System.out.println(Arrays.toString(arr));
		}
}
