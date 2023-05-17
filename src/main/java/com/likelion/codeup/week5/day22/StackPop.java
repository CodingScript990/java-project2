package com.likelion.codeup.week5.day22;

import java.util.Arrays;

public class StackPop {
		// Pop
		// Member field
		private int[] arr = new int[10000]; // 메모리 크기(size)
		private int pointer = 0; // 값을 관리해줌

		// push function method add
		public void push(int value) {
				this.arr[pointer++] = value;
				System.out.printf("push : %d\n", value);
		}

		// pop method => 방향성이 중요함
		public int pop() {
				// temp 라는 변수를 추가로 사용하지만 직관적임
				int temp = this.arr[pointer - 1];
				pointer --;
				return temp;
		}

		// pop2 method => 덜 직관적임
		public int pop2() {
				return this.arr[--pointer];
		}

		public static void main(String[] args) {

				// StackPop 객체 생성
				StackPop stackPop = new StackPop();

				// push
				stackPop.push(10);
				stackPop.push(20);

				// 구분선
				System.out.println("---------");

				// pop
				System.out.println("pop : " + stackPop.pop());
				System.out.println("pop : " + stackPop.pop());
		}
}
