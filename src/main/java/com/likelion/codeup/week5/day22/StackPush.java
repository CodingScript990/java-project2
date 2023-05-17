package com.likelion.codeup.week5.day22;

import java.util.Arrays;

public class StackPush {
		// Push
		// Member field
		private int[] arr = new int[10000]; // 메모리 크기(size)
		private int pointer = 0; // 값을 관리해줌

		// push function method add
		public void push(int value) {
				this.arr[pointer++] = value;
				System.out.println(Arrays.toString(arr)); // 배열로 값을 변환
				System.out.println("pointer : " + pointer); // size length check
		}

		// 코드 stack 처음 배울 시
		public void push2(int value) {
				this.arr[pointer] = value;
				this.pointer++;
		}

		// main method
		public static void main(String[] args) {
				// StackPush 객체 생성
				StackPush stackPush = new StackPush();

				// push method call
				stackPush.push(10);
				stackPush.push(20);
		}
}
