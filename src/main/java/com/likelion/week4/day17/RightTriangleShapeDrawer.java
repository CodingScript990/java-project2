package com.likelion.week4.day17;

// 자식 클래스
public class RightTriangleShapeDrawer extends ShapeDrawer2{
		// 추상 메서드
		@Override
		public String makeALine(int height, int i) {
				return String.format("%s%s\n", "", "*".repeat(i));
		}

		// main method
		public static void main(String[] args) {

				// 부모의 타입으로도 상속받아 사용할 수 있음을 보여주는 것임
				ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();

				// 상속받은 것을 기능을 사용하여 출력해줌!
				rightTriangle.printShapePyramid(5);
		}
}
