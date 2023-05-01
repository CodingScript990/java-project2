package com.likelion.week3.day11;

public class NewSwitchCaseSeason {
		public static void main(String[] args) {

				// int type initial value
				int month = 6;

				// switch statement[Simple]
				switch (month) { // condition value
						case 12, 1, 2 -> System.out.println("겨울"); // output
						case 3, 4, 5 -> System.out.println("봄");
						case 6, 7, 8 -> System.out.println("여름");
						case 9, 10, 11 -> System.out.println("가을");
						default -> System.out.println("해당하는 계절이 없습니다."); // other output
				}
				/**
				 * Switch Statement[표현문]
				 * - 프로그램의 실행 단위를 말함
				 * - 하나 이상의 표현식으로 구성됨
				 */
		}
}
