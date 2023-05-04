package com.likelion.week3.day14;

public class TrinomialOperator {
		public static void main(String[] args) {

				// 삼항연산자를 이용하여 해결
				int[] arr = new int[]{1,2,8,4,5,6,12,40};

				int iMax = arr[0];

				for(int i = 1; i < arr.length; i++) {
						iMax = (arr[i] > iMax) ? arr[i] : iMax;
				}

				System.out.println(iMax);
		}
}
