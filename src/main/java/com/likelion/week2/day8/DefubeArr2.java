package com.likelion.week2.day8;

import java.util.Arrays;

public class DefubeArr2 {
		public static void main(String[] args) {
				// {} : new 연산자를 사용하지 않고 배열을 이용하겠다는 의미!
				int[] iArr = new int[]{1,2,3,8};

				// output
				System.out.println("iArr[0] : " + iArr[0]);

				// 2차원 배열 3 X 2 만들겠다는 의미 => 초기화
				int[][] arr32 = new int[3][2];
				// 2차원 배열 6 X 7 만들겠다는 의미 => 초기화
				int[][] arr67 = new int[6][7];

				// 3행 3열 => 2차원 배열
				int[][] arr2 = {
								{10, 20, 30},
								{40, 50, 60},
								{70, 80, 90}
				};

				// output 2차원배열 => 3행X3열
				System.out.println(Arrays.toString(arr2[0]));
				System.out.println(Arrays.toString(arr2[1]));
				System.out.println(Arrays.toString(arr2[2]));

				// output 2차원배열 => 2행X2열
				System.out.println(arr2[0][0]);
				System.out.println(arr2[0][1]);
		}
}
