package com.likelion.week2.day10;

import java.util.Arrays;

public class AutoSwap {
		public static void main(String[] args) {

				// 오름차순 Sort[정렬]
				// int type array reference value
				int[] arr = {2, 1, 7, 9};

				// boolean type => index value 비교연산
				boolean check = arr[0] > arr[1];

				// loop
				if (check) {
						int temp = arr[0];
						arr[0] = arr[1];
						arr[1] = temp;
				}

				// output
				System.out.println(Arrays.toString(arr));
		}
}
