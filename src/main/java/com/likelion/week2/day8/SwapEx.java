package com.likelion.week2.day8;

import java.util.Arrays;

public class SwapEx {
		public static void main(String[] args) {
				// 오름차순으로 정렬하는 알고리즘을 만들어 보기
				// 배열 인덱스간에 값 바꾸기

				// 1차원 배열
				int[] arr = {2, 1, 4, 8, 7, 6};

				// output
				System.out.println("1차원 배열 초기값");
				System.out.println(Arrays.toString(arr));

				int temp = arr[0]; // index[0] 있는 값
				arr[0] = arr[1]; // index[0] 덮어 쓰기
				arr[1] = temp; // 임시로 저장한 값을 1번에 넣기

				// output
				System.out.println("\n1차원 배열 temp arr[0] -> arr[1] 위치변경된 값");
				System.out.println(Arrays.toString(arr));
		}
}
