package com.likelion.week4.day16;

public class DiEx {
		// Member Variable
		private ShapeDrawer shapeDrawer;
		// 자식클래스로 선언했기에
		private ParallelogramShapeDrawer parallelogramShapeDrawer;

		// ShapeDrawer 를 의존하는 Constructor 를 생성함
		public DiEx(ShapeDrawer shapeDrawer) {
				this.shapeDrawer = shapeDrawer;
		}

		// ShapeDrawer 를 가공하여 출력되도록 해주는 메서드
		public void doSth() {
				shapeDrawer.printPyramid(5);
		}
}
