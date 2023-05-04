package com.likelion.week3.day14;

public class MathMax {
		public static void main(String[] args) {

				// Math 라이브러리 사용하여 해결

				int[] arr = new int[]{1,2,8,4,5,6,12,24};

				int iMax = arr[0];

				for(int i = 1; i < arr.length; i++) {

						iMax = Math.max(iMax, arr[i]);
				}

				System.out.println(iMax);
		}
}
