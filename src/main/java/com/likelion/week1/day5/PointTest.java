package com.likelion.week1.day5;

public class PointTest {

		public static void main(String[] args) {
				// Public 접근 제어자를 통해 variable 의 값을 사용
				Point point = new Point();

				System.out.printf("test1:%d, test2:%d\n", point.test1, point.test2);

				// 0, 0의 점 만들기
				point.x = 0;
				point.y = 0;

				System.out.printf("x:%d, y:%d\n", point.x, point.y);
				System.out.printf("xy가 같은지?  %s\n", point.isSameXy());

				// 또 다른 점 찍기
				Point p2 = new Point();
				p2.x = 1;
				p2.y = 1;
				System.out.printf("xy가 같은지? %s\n", p2.isSameXy());

				// 또 다른 점 찍기
				Point p3 = new Point();
				p3.x = 3;
				p3.y = 2;
				System.out.printf("xy가 같은지? %s\n", p3.isSameXy());
		}
}
