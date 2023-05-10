package com.likelion.week4.day17;

import java.io.IOException;

// Printer => interface
public interface Printer {
		// 출력만 해주는 작업[예외처리 기능까지 처리]
		void print(String[] lines) throws IOException;
}
