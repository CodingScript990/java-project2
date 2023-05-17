package com.likelion.codeup.week5.day22;

import java.util.Stack;

public class StackPopException {
		// PopException
		// Member field
		private int[] arr = new int[10000]; // 메모리 크기(size)
		private int pointer = 0; // 값을 관리해줌
		private String flagMsg = ""; // 구분선을 위한 작업

		// push function method add
		public void push(int value) {
				this.arr[pointer++] = value;
				System.out.printf("push : %d\n", value);
		}

		// isEmpty method => true? false?
		public boolean isEmpty() {
				return this.pointer == 0;
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
		
		// pop3 method => 에러 메세지를 남겨주는 방법이 있음
		public int pop3() {
				// if statement [예외 처리를 하여 => 에러 메세지 출력!]
				if (isEmpty()) throw new RuntimeException("스택이 비었습니다.");
				return this.arr[--pointer];
		}

		// 구분선 method add
		public void dividingLine() {
				flagMsg = "---------";
				System.out.println(flagMsg);
		}

		// Main method
		public static void main(String[] args) {

				// StackIsEmpty 객체 생성
				StackPopException isEmpty = new StackPopException();

				// push
				isEmpty.push(10);
				isEmpty.push(20);

				// 구분선
				isEmpty.dividingLine();

				// pop
				System.out.println("pop : " + isEmpty.pop3());
				System.out.println("pop : " + isEmpty.pop3());
				System.out.println("pop : " + isEmpty.pop3()); // 에러 메세지를 설정한 것이 나옴!

				// Array Out Of Bound => 배열의 크기보다 크거나 음수 인덱스에 대한 요청이 있으면 자바는 위의 예외를 발생
				//System.out.println("pop : " + isEmpty.pop());

				// 구분선
				isEmpty.dividingLine();

				// isEmpty
				System.out.println("isEmpty : " + isEmpty.isEmpty());

				// EmptyStackException : 비어있는 상태에서 삭제를 시도해서 런타임 에러
				//Stack<Integer> realStack = new Stack<>();

				//realStack.pop();
		}
}
