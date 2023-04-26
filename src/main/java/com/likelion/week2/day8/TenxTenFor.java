package com.likelion.week2.day8;

import java.util.Arrays;

public class TenxTenFor {
		public static void main(String[] args) {
				// Array 초기화
				int[][] arr10x10 = new int[10][10];

				// 배열값을 0 ~ 10까지 출력[반복문(for)을 이용함]
				for (int i = 0; i < 10; i++) {
						// i => 0 ~ 10
						System.out.println(Arrays.toString(arr10x10[i]));
				}
		}
}
