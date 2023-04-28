package com.likelion.codeup.week2.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeUp1441 {
		public static void main(String[] args) {

				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type setting
				int temp = 0;

				// int type initial value
				int bubbleInputOne = sc.nextInt();
				int bubbleInputTwo = sc.nextInt();
				int bubbleInputThird = sc.nextInt();
				int bubbleInputFour = sc.nextInt();
				int bubbleInputFive = sc.nextInt();
				int bubbleInputSix = sc.nextInt();

				// int array instance
				int[] arr = new int[]{bubbleInputOne, bubbleInputTwo, bubbleInputThird, bubbleInputFour, bubbleInputFive, bubbleInputSix};

				// for statement
				for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < (arr.length - 1) - i; j++) {
								if (arr[j] > arr[j + 1]) {
										temp = arr[j];
										arr[j] = arr[j + 1];
										arr[j + 1] = temp;
								}
						}
				}

				// ArrayList type[Integer] instance
				ArrayList<Integer> arrList = new ArrayList<>();

				// for statement
				for (int result : arr) {
						if (!arrList.contains(result)) {
								arrList.add(result);
						}
				}

				// int array type
				int[] newArr = new int[arrList.size()];

				// for statement
				for (int i = 0; i < newArr.length; i++) {
						newArr[i] = arrList.get(i);
				}

				// for statement
				for (int i = 0; i < newArr.length; i++) {
						System.out.println(newArr[i] + " ");
				}
		}
}
