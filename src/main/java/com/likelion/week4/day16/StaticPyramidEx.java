package com.likelion.week4.day16;

public class StaticPyramidEx {
		// static 접근제어자로 다른 class에도 사용이 용이함
		public static int height = 4;

		// makeALine method add
		public static String makeALine(int height, int i) {
				return String.format("%s%s", "".repeat(i), "*".repeat(height - i));
		}

		// main method
		public static void main(String[] args) {
				// new Operator 없이 static 으로만 호출하게 하여 출력이 되도록 해주는 작업

				// for statement
				for (int i = 0; i < height; i++) {
						System.out.println(makeALine(height, i));
				}
		}
}
