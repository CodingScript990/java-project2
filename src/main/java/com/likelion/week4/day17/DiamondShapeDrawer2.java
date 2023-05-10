package com.likelion.week4.day17;

import java.io.IOException;

// 자식 클래스
public class DiamondShapeDrawer2 extends ShapeDrawer2 {

		public static String getRepeatedSymbol(String symbol, int n) {
				return symbol.repeat(n);
		}

		@Override
		public String makeALine(int height, int i) {

				int pivot = height / 2;

				if (i <= pivot) {
						// 피라미드
						// 초항이 3 등차가 -2
						return String.format("%s%s\n", getRepeatedSymbol("0", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
				} else {
						// 역피라미드
						return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
				}
		}

		public static void main(String[] args)  {

				ShapeDrawer2 diamondShapeDrawer2 = new DiamondShapeDrawer2();

//				int height = 5;

				diamondShapeDrawer2.printShapeDiamond(5);
		}
}
