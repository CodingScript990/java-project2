package com.likelion.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
		// Class readALine => Read One Line
		public void readALine() throws IOException {
				// InputStreamReader 라는 Class 를 is 라는 name 으로 선언해줌
				InputStreamReader is = new InputStreamReader(System.in);
				// BufferedReader 라는 Class 를 br 라는 name 으로 선언해줌
				BufferedReader br = new BufferedReader(is); // 카트 가져오기

				// 단축키 Ctrl + Alt + v, soutv
				// 한줄만 출력
				// String line = br.readLine();
				// System.out.println("line = " + line);

				// 2줄 출력
				System.out.println("br1 = " + br.readLine());
				System.out.println("br2 = " + br.readLine());
		}

		// Class plusTwoNumbers => Read Two Line [object1, object2]
		public void plusTwoNumbers() throws IOException {
				// InputStreamReader 라는 Class 를 is 라는 name 으로 선언해줌
				InputStreamReader is = new InputStreamReader(System.in);
				// BufferedReader 라는 Class 를 br 라는 name 으로 선언해줌
				BufferedReader br = new BufferedReader(is);
				// Output 1줄 출력[String + String]
				System.out.println("br = " + br.readLine() + br.readLine());
		}
}
