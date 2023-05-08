package com.likelion.week4.day15;

public class GreetTest {
		public static void main(String[] args) {

				// Greet 를 사용할려면 일단 불러야함!

				// 1. new Greet 인스턴스화 된 것을 불러오고,
				// 2. Greet 참조변수를 gt로 생성해줌! 그리고 new Greet 인스턴스화 된 것을 대입해줌!
				// 3. Greet 를 사용하기 위함임
				Greet gt = new Greet();

				// gt 참조변수를 사용하여 printHello 함수를 call 하여 출력해줌!
				gt.printHello();

				// output : Hello 가 출력됨을 알 수 있음!
		}
}
