package com.likelion.week4.day16;

public class CallStaticMethod {
		public static void main(String[] args) {
				// static method 를 만들어 놓은 것을 호출하여 사용하기 위한 것

				// int 타입 Variable setting
				int height = 5;

				// For statement
				for (int i = 0; i < height; i++) {
						// 다른 클래스임에도 불구하고 static 으로 makePyramidLine 메서드를 사용 할 수 있음
						String line = PrintStarUtils.makePyramidLine(height, i);
						// 출력
						System.out.println(line);
				}
		}
}
