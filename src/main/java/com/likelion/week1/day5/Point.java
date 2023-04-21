package com.likelion.week1.day5;

public class Point {
		// 접근 제어자 private
		//private int x; // 다른 Class 에 접근이 안됨
		//private int y;

		// public 접근제어자
		public int x;
		public int y;
		public int test1 = 1;
		public int test2 = 1;
		/**
		 * public, private : 안붙이면(default), protected => variable type 앞에 붙는 것 : 접근제어자
		 * private 붙이면 같은 Class 안에서만 접근가능
		 * public 붙이면 다른 곳에서도 접근가능
		 */

		// boolean type method => isSameXy
		boolean isSameXy() {
				// x와 y가 같냐?
				return x == y;
		}

		double getDistance(Point p2) {
				int xL = p2.x - this.x;
				int yL = p2.y - this.y;

				double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
				double rs = Math.sqrt(sumOfPow);

				return rs;
		}

		// 지역변수 => x, y
		public static void main(String[] args) {
				Point point = new Point();
				System.out.printf("x:%d, y:%d", point.x, point.y);
		}
}
