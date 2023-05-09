package com.likelion.week4.day16;

public class PrintStarUtils {

		// Static method add
		public static String makePyramidLine(int height, int i) {
				// 값을 리턴해줌
				return String.format("%s%s", "".repeat(i), "*".repeat(height - i));
		}
}
