package com.likelion.week4.day17;

// 부모 추상 클래스
public abstract class ShapeDrawer2 {

		// 추상메서드
		public abstract String makeALine(int height, int i);

		// 출력해주는 메서드
		public void printShapePyramid(int height) {

				for (int i = 0; i <= height; i++) {
						System.out.printf("%s", makeALine(height, i));
				}
		}

		// 출력해주는 메서드
		public void printShapeDiamond(int height) {

				for (int i = 0; i < height; i++) {
						System.out.printf("%s", makeALine(height, i));
				}
		}
}
