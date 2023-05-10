package com.likelion.week4.day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 인터페이스 구현체 만들기
// HelloFilePrinter => printer2 상속받음[interface]
public class HelloFilePrinter implements Printer2 {

		// 출력해주는 메서드
		// HelloPrinter 에서 파일에 출력 해주는 메서드를 말함!
		@Override
		public void print(String msg) throws IOException {

				// 파일을 생성하여 입력해주는 작업
				BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
				// 파일 메세지 생성
				bw.append(msg);
				// 파일 메세지에 text 작성
				bw.flush();
				// 파일 메세지를 종료함
				bw.close();
		}
}
