package com.likelion.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
		// Class Add => readAChar
		public void readAChar() throws IOException {
				// InputStreamReader 라는 Class 를 is 라는 name 으로 선언해줌
				InputStreamReader is = new InputStreamReader(System.in);
				System.out.println(is.read()); // IOException 예외처리 하겠다!
		}

		// Class Add => readTwoChars
		public void readTwoChars() throws IOException {
				InputStreamReader is = new InputStreamReader(System.in);

				// 아스키코드로 읽어오는 Object 2개 Add
				int asciiCode1 = is.read(); // 아스키코드 1
				int asciiCode2 = is.read(); // 아스키코드 2

				// 단축키 => soutv
				System.out.println("asciiCode1 = " + asciiCode1);
				System.out.println("asciiCode2 = " + asciiCode2);
		}
}
