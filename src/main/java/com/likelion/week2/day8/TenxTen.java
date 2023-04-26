package com.likelion.week2.day8;

import java.util.Arrays;

public class TenxTen {
		public static void main(String[] args) {
				// 타입[][] 변수명 = new 타입[개수1][개수2];
				// 2차원 배열 = 3행 X 3열
				int[][] aArrTwo = new int[3][3];

				// output
				System.out.println("aArrTwo : " + Arrays.toString(aArrTwo[0]));
				System.out.println("aArrTwo : " + Arrays.toString(aArrTwo[1]));
				System.out.println("aArrTwo : " + Arrays.toString(aArrTwo[2]));

				// 10차원 배열 = 10행 X 10열
				int[][] aArrTen = new int[10][10];

				// output
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[0]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[1]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[2]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[3]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[4]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[5]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[6]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[7]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[8]));
				System.out.println("aArrTen : " + Arrays.toString(aArrTen[9]));
		}
}
