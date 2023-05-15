package com.likelion.codeup.week5.day20;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleDecreasingSort {
		// 내림차순
		Comparator<Integer> comparator; // 비교를 해주는 역할[parameter 를 2개를 받아와줌]

		// constructor
		public BubbleDecreasingSort(Comparator<Integer> comparator) {
				this.comparator = comparator;
		}

		// sortARound method
		public int[] sortARound(int[] arr, int until) { // until => 1
				// for statement
				for (int i = 0; i < until; i++) { // until => arr.length - 1
						// if statement
						if (comparator.compare(arr[i], arr[i + 1]) > 0) { // [0,1,2,3,4,5]
								// int type => arr[index]
								int temp = arr[i];

								arr[i] = arr[i + 1];
								arr[i + 1] = temp;
						}
				}
				// return arr value
				return arr;
		}

		// sort method
		public int[] sort(int[] arr) {
				// for statement
				for (int j = 1 ; j <= arr.length; j++) {
						// sortARound method
						arr = sortARound(arr, arr.length - j);
				}
				// return arr value
				return arr;
		}
		public static void main(String[] args) {
				// decreasingSort[객체] 생성 => new BubbleDecreasingSort();
				// 음수이면 내림차순
				// 양수이면 오름차순
				BubbleDecreasingSort decreasingSort = new BubbleDecreasingSort(new Comparator<Integer>() {
						@Override
						public int compare(Integer o1, Integer o2) {
								return o2 - o1;
						}
				});

				// int[] add
				int[] arr = {7,2,3,9,28,1};

				// arr sort
				arr = decreasingSort.sort(arr);

				// output
				System.out.println("arr : " + Arrays.toString(arr));
		}
}
