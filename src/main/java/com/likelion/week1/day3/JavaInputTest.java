package com.likelion.week1.day3;

import java.io.IOException;

// : 간단한 설명
/**
* 코드 설명 및 코드 정리(수정일자, 작업자명, 작업한 내용, 등등)
 */

public class JavaInputTest {
		public static void main(String[] args) throws IOException {
				// JavaInput Instantiation = new Operator[JavaInput]
				JavaInput javaInput = new JavaInput();

				// JavaInput 에서 readAChar method Call[Output]
				//javaInput.readAChar(); // main method 에도 IOException 처리를 함

				// JavaInput 에서 readTwoChars method Call[Output]
				javaInput.readTwoChars();
		}
}
