package com.likelion.week4.day17;

// 인터페이스 구현체 만들기
// HelloConsolePrinter => printer2 상속받음[interface]
public abstract class HelloConsolePrinter implements Printer2 {

		// 출력해주는 메서드
		// HelloPrinter 에서 콘솔에 출력 해주는 메서드를 말함!
		@Override
		public void print(String msg) { // parameter[msg]

				// output[콘솔에 출력]
				System.out.println(msg);
		}
}
