package com.likelion.week4.day17;

import java.io.IOException;

public class HelloPrinter extends HelloShapeDrawer {
		// 파일에도 저장

		// interface 사용해주기 위함!
		// [HelloConsolePrinter 인스턴스화 해서 printer 레퍼런스타입 변수로 print method 를 사용해주기 위함임!(DI 주입전)]
		//Printer2 printer = new HelloConsolePrinter();
		
		// DI를 주입해줌!
		Printer2 printer;

		// 콘솔에 출력 해주는 메서드 => HelloConsolePrinter Class 로 대처!
		//public void print(String msg) { // parameter[msg]
				//System.out.println(msg);
		//}
		
		// Constructor 를 만들어서 Printer2 interface 가 반영되도록 해줌
		public HelloPrinter(Printer2 printer) { // parameter[Printer2]
				this.printer = printer;
		}

		// helloPrintShape 를 만들어 사용자가 입력한 값이 출력되도록 해주는 메서드
		public void helloPrintShape(String msg) throws IOException {
				printer.print(msg);
		}

		// Main method => IOException 예외처리를 해줌![입출력 처리]
		public static void main(String[] args) throws IOException {

				// 콜솔 출력 메서드를 사용하기 위한 클래스 타입의 인스턴스(객체)를 생성해주는 역할
				HelloPrinter hp = new HelloPrinter(new HelloFilePrinter()); // 인스턴스 생성

				// 참조값(Reference value)를 사용하여 출력해주는 메서드를 사용하여 입력값을 콘솔에 출력해줌(바로 print 메서드로 출력)
				//hp.print("Hello");
				//hp.print("Bye");

				// 참조값(Reference value)를 사용하여 출력해주는 메서드를 사용하여 입력값을 콘솔에 출력해줌(바로 반복문 메서드로 출력)
				hp.helloPrintShape("Hi"); // 호출


		}

}
