package com.likelion.week3.day11;

public class ForLoop {
		public static void main(String[] args) {

				// for statement
				for (int i = 10; i > 0; i++) {
						// output => loop reserve[무한 루프가 일어남!!]
						System.out.printf("%d\n", i); // 이것을 해결 해주기 위해서는?
						// for(초기값; 조건식; 증감식;[--])를 사용해줘야함!
				}
		}
}
