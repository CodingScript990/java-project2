package com.likelion.week2.day7;

import java.util.Arrays;

public class ArraysToString {
		public static void main(String[] args) {

				// int array
				int[] iArr = new int[5];

				// int index[i]
				iArr[0] = 2; // 0 => 2
				iArr[1] = 4; // 1 => 4
				iArr[2] = 7; // 2 => 7

				// output
				System.out.println(Arrays.toString(iArr)); // 2,4,7,0,0
		}
}
