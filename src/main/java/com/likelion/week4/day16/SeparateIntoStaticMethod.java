package com.likelion.week4.day16;

import java.util.Arrays;

public class SeparateIntoStaticMethod {
		// Refactoring
		public static void printArr(int[][] arr) {

				// 반복 작업을 리팩토링을 통해서 호출만 되도록 하고
				// 수정도 만든 메서드 내부코드에서 수정을 하여 재사용성이 용이하게
				// 되도록 하는 것임!
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println("-------------");
		}

		// Main method
		public static void main(String[] args) {

				// int 타입 배열값 설정
				int[][] arr = {
								{10,20,30},
								{40,50,60},
								{70,80,90}
				};

				// printArr 출력 메서드를 호출 => 원하는 int 배열 변수를 넣어 출력
				printArr(arr);

				// arr[index][index] = 설정값;
				arr[0][0] = 0;
				arr[1][1] = 0;
				arr[2][2] = 0;

				// printArr 출력 메서드를 호출 => 원하는 int 배열 변수를 넣어 출력
				printArr(arr);

				// arr[index][index] = 설정값;
				arr[1][1] = 5;

				// printArr 출력 메서드를 호출 => 원하는 int 배열 변수를 넣어 출력
				printArr(arr);
		}
}
