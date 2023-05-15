package com.likelion.codeup.week5.day20;

import java.util.Arrays;

public class BubbleOop {
		// sortARound method
		public int[] sortARound(int[] arr, int until) { // until => 1
				// for statement
				for (int i = 0; i < until; i++) { // until => arr.length - 1
						// if statement
						if (arr[i] > arr[i + 1]) { // [0,1,2,3,4,5]
								// int type => arr[index]
								int temp = arr[i];

								arr[i] = arr[i + 1];
								arr[i + 1] = temp;
						}
				}
				// return arr value
				return arr;
		}

		// sort method
		public int[] sort(int[] arr) {
				// for statement
				for (int j = 1 ; j <= arr.length; j++) {
						// sortARound method
						arr = sortARound(arr, arr.length - j);
				}
				// return arr value
				return arr;
		}
		public static void main(String[] args) {

				// bubbleOop[객체] 생성 => new BubbleOop();
				BubbleOop bubbleOop = new BubbleOop();

				// int[] add
				int[] arr = {7,2,3,9,28,1};

				// arr sort
				arr = bubbleOop.sort(arr);

				// output
				System.out.println("arr : " + Arrays.toString(arr));
		}
}
