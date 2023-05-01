package com.likelion.week3.day11;

public class NewSwitchCaseDaysOfMonth {
		public static void main(String[] args) {

				// int type initial value
				int month = 11; // 11

				// int type => switch case [throw new IllegalArgumentException]
				int lastDate = switch (month) { // condition value
						case 1,3,5,7,8,10,12 -> 31; // case condition value -> value;[31]
						case 4,6,9,11 -> 30; // case condition value -> value;[30]
						case 2 -> 28; // case condition value -> value;[28]
						default -> throw new IllegalArgumentException("잘못된 월:" + month);
						// default -> IllegalArgumentException error 처리["잘못된 월:"]
				}; // IllegalArgumentException 예외처리를 해줘야함!

				// output
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDate);
				// [month value] [lastDate value]

				/**
				 * Switch Expression[표현식]
				 * - 값이나 변수, 연산자의 조합이며, 하나의 값으로 평가함
				 * - 값을 반환 => 변수에 값을 지정할 수 있음
				 */
		}
}
