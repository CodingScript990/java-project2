package com.likelion.week6.day28.collectionex.stackex;

import java.util.Stack;
// May.26 2023
public class StackClass implements StackInterface{

		private Stack<String> stack = new Stack<>();
		private String stackInput;

		// 추가 메서드
		void stackAdd(String stackInput) {
				stack.add(stackInput);
		}

		// pop 메서드
		void stackPop() {
				System.out.printf("Stack Pop : %s\n", stack.pop());
		}

		// push 메서드
		void stackPush(String stackInput) {
				System.out.printf("Stack Push : %s\n", stack.push(stackInput));
		}

		// peek 메서드
		void stackPeek() {
				System.out.printf("Stack Peek : %s\n", stack.peek());
		}

		// empty 메서드
		void stackEmpty() {
				System.out.printf("Stack Empty : %s\n", stack.empty());
		}

		// 출력 메서드
		@Override
		public void stackPrint() {
				System.out.printf("Stack Result : %s\n", stack);
		}
}
