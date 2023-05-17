package com.likelion.codeup.week5.day21;

public class InsertionSort {
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
								System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
						}
						System.out.println("-------------");
				}
		}
}
