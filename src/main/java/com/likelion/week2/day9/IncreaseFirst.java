package com.likelion.week2.day9;

public class IncreaseFirst {
		public static void main(String[] args) {

				// 배열 연산
				int idx = 0;
				// int array 참조값 설정
				int[] arr = {2, 1, 7, 4};
				// [index] : 0  1  2  3

				// output

				// Index[0] 2
				System.out.println("First arr[idx] : " + arr[idx++]); // 2[index 위치 값]
				// Index[1] 1
				System.out.println("Two arr[idx] : " + arr[idx++]); // 2 >> 1[index 위치 값]
				// Index[2] 7
				System.out.println("Third arr[idx] : " + arr[idx++]); // 1 >> 7[index 위치 값]
		}
}
