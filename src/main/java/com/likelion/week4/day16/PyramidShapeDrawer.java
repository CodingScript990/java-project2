package com.likelion.week4.day16;

public class PyramidShapeDrawer extends ShapeDrawer{
		// 추상 메소드 오버라이딩[Method Overriding]
		@Override
		public String makeALine(int h, int i) {
				return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
		}
}
