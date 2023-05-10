package com.likelion.week4.day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// FilePrinter class => interface Printer 를 상속받음
public class FilePrinter implements Printer{
		// 출력하기
		@Override
		public void print(String[] lines) throws IOException {

				// File 을 생성해주고 작성해주는 작업
				BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.text"));

				for (int i = 0; i < lines.length; i++) {
						bw.append(lines[i]);
						bw.flush();
				}

				bw.close();
		}
}
