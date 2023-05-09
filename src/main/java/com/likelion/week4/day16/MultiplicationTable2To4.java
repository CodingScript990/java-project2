package com.likelion.week4.day16;

public class MultiplicationTable2To4 {

		// Member Variable Setting
		private String multipleSymbol;

		// Constructor add[multipleSymbol]
		public MultiplicationTable2To4(String multipleSymbol) {
				this.multipleSymbol = multipleSymbol;
		}

		// refactoring => 내부 코드 사용을 위함
		public void printDan(int dan) { // parameter
				for (int i = 1; i < 10; i++) {
						System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
				}
				System.out.println("----------");
		}

		// Main method
		public static void main(String[] args) {

				// 2, 5, 7, 8 단
				// method 호출로만 이루어질 수 도 있음
				// new 연산자로 객체를 호출하여 원하는 값을 넣고 사용할 수 있도록 작업
				// [multipleSymbol change] => "X"

				MultiplicationTable2To4 mt = new MultiplicationTable2To4("x");

				// MultiplicationTable2To4 참조 타입 mt 참조변수를 사용하여
				// printDan method 를 호출해 원하는 입력값을 넣어 출력해줌
				mt.printDan(2);
				mt.printDan(5);

				// new 연산자로 객체를 호출하여 원하는 값을 넣고 사용할 수 있도록 작업2
				// [multipleSymbol change] => "*"
				MultiplicationTable2To4 mt2 = new MultiplicationTable2To4("*");

				// MultiplicationTable2To4 참조 타입 mt2 참조변수를 사용하여
				// printDan method 를 호출해 원하는 입력값을 넣어 출력해줌
				mt2.printDan(7);
				mt2.printDan(8);
		}
}
