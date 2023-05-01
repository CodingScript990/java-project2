package com.likelion.week3.day11;

public class ForLoopReverse {
		public static void main(String[] args) {

				// for statement => Loop Reverse
				for (int i = 5; i > 0; i--) { // initial; condition; decreasing;
						// output => result value
						System.out.printf("%d\n", i);
				}
				/**
				 * Loop Reverse
				 * - 초기값이 조건보다 클 경우, 증감식에서 표현을 잘해줘야함!
				 * - 그렇지 못하면 무한 루프가 되어 시스템이 다운됨![유의]
				 * - 해결하기 위해서는 증가식이 아니라 감소식을 이용하여 시스템이 종료되게 해야함!
				 */
		}
}
