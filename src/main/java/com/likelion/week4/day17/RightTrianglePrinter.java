package com.likelion.week4.day17;

import java.io.IOException;

// RightTrianglePrinter class
public class RightTrianglePrinter {

		// interface 선언[인터페이스 구현체를 넣어줌]
		private Printer printer;

		// Constructor add
		public RightTrianglePrinter(Printer printer) {
				this.printer = printer;
		}

		// System.out --> Console
		// BufferedWriter --> Console, File

		public String makeALine(int height, int i) {
				return String.format("%s%s\n", "", "*".repeat(i));
		}

		// 모양 출력하기
		public void printShape(int height) throws IOException {

				// 모양 만들기
				String[] lines = new String[height];

				for (int i = 0; i < height; i++) {

						lines[i] = makeALine(height, i + 1);
				}

				// 모양 출력하기
				printer.print(lines);
//				printToFile(lines);
		}


		// Main method => output 만 나오게 하기!
		public static void main(String[] args) throws IOException {

				RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
				rtp.printShape(7);
		}
}