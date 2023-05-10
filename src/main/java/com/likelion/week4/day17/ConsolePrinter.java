package com.likelion.week4.day17;

import java.io.IOException;

// ConsolePrinter class => interface Printer 를 상속받음

// 출력은 콘솔 프린터에서 인터페이스를 활용하여 출력이 되도록 함
public class ConsolePrinter implements Printer {
		// 출력만 해주는 인터페이스 기능을 사용!
		@Override
		public void print(String[] lines) throws IOException {
				// 콘솔에 모양 출력하기
				for (int i = 0; i < lines.length; i++){
						System.out.print(lines[i]);
				}
		}
}
