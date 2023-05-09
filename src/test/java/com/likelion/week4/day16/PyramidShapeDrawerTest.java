package com.likelion.week4.day16;

class PyramidShapeDrawerTest {
		public static void main(String[] args) {

				ShapeDrawer shapeDrawer = new PyramidShapeDrawer();

				shapeDrawer.printPyramid(4);

				ShapeDrawer prallelogramSD = new ParallelogramShapeDrawer();

				prallelogramSD.printPyramid(5);
		}
}