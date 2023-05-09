package com.likelion.week4.day16;

// 추상 클래스 생성
public abstract class ShapeDrawer {

		// printPyramid 메서드는 범위가 넓음[어디든 호출시 사용이 가능함!]
		public void printPyramid(int height) {
				for (int i = 0; i < height; i++) {
						System.out.print(makeALine(height, i));
				}
		}

		// 추상 메서드 생성
		public abstract String makeALine(int h, int i);
}
