package com.likelion.week4.day17;

public class DiamondPrint {
		// Refactoring

		// 1. 입력값을 받아오는 메서드
		public static String getRepeatedSymbol(String symbol, int n) {
				return symbol.repeat(n);
		}

		// 2. 입력값을 계산해주는 메서드
		public static String makeALine(int height, int i) {

				int pivot = height / 2;

				if (i <= pivot) {
						// 피라미드
						// 초항이 3 등차가 -2
						return String.format("%s%s\n", getRepeatedSymbol("0", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
				} else {
						// 역피라미드
						return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
				}
		}

		// 3. 출력해주는 메서드
		public void printShape(int height) {
				for (int i = 0; i < height; i++) {
						System.out.print(makeALine(height, i));
				}
		}

		// Main method
		public static void main(String[] args) {

				// 다이아몬드 출력

				// DiamondPrint 참조타입의 diamondPrint 참조변수에게 메서드를 활용하기 위해 호출해줌
				DiamondPrint diamondPrint = new DiamondPrint();

				// 입력값 변수 설정
				int height = 5;

				// 참조변수에서 출력하는 메서드를 호출하여 입력값 변수를 넣어 값을 출력해줌
				diamondPrint.printShape(height);
				/**
										      [출력]
										i       n      symbol
										0       2       "0"
										0       1       "*"
										1 			1       "0"
										1			  3       "*"
										2       0				"0"
										2			  5				"*"
										3			  1				"0"
										3			  3				"*"
										4			  2				"0"
										4			  1				"*"

								  00*   => i:0 n[0이 2개][*이 1개]
								  0***  => i:1 n[0이 1개][*이 3개]
								  ***** => i:2 n[0이 0개][*이 5개]
								  0***  => i:3 n[0이 1개][*이 3개]
								  00*   => i:4 n[0이 2개][*이 1개]
				*/
		}
}
