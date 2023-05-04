package com.likelion.week3.day14;

public class MinMax {
		public static void main(String[] args) {

				// for 문으로 배열 해결

				int[] arr = new int[]{1,2,3,4,5,6,7,12,23,100}; // 배열을 만들어줌

				int iMax = arr[0];

				for(int num = 1; num < arr.length; num++) {

						if(arr[num] > iMax) {
								iMax = arr[num];
						}
				}

				System.out.println(iMax);
		}
}
