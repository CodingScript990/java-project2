package com.likelion.codeup.week5.day22;

public class StackPeek {
		// Peek
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

		// peek method => 확인용도!
		public int peek() {
				// push(10)
				// arr : 0  0
				// arr : 10 0 => pointer : 1
				if (isEmpty()) throw new RuntimeException("스택이 비어 있습니다.");
				return this.arr[pointer - 1];
		}

		// 구분선 method add
		public void dividingLine() {
				flagMsg = "---------";
				System.out.println(flagMsg);
		}

		// Main method
		public static void main(String[] args) {

				// StackPeek 객체 생성
				StackPeek stackPeek = new StackPeek();

				// peek => RuntimeException error message "스택이 비어 있습니다."
				System.out.println("peek : " + stackPeek.peek());

				// push
				stackPeek.push(10); // 10

				// peek
				System.out.println("peek : " + stackPeek.peek()); // 10

				// 구분선
				stackPeek.dividingLine();

				// push
				stackPeek.push(20); // 20

				// peek
				System.out.println("peek : " + stackPeek.peek()); // 20
		}
}
