package com.likelion.week1.day4;

public class PrintWhy {
		// 불합리한 구조임
		/**
		 * Heep : new 를 할 때 생성이 됨
		 * Static : JVM 이 실행 될 때 생성이 되기 때문임
		 */
		void print() {
				System.out.println("Why");
		}

		public static void main(String[] args) {
				//print();
		}
}
