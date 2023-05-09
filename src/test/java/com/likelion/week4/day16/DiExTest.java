package com.likelion.week4.day16;

class DiExTest {
		public static void main(String[] args) {
				// 의존성 주입 개념 => 추상화
				// 자식은 부모에게 상속받아 메소드, 멤버변수를 이용 할 수 있으나,
				// 부모가 자식을 상속받는 행위는 의존성에 문제가 발생하여 호출X
				DiEx diEx = new DiEx(new ParallelogramShapeDrawer());
				diEx.doSth();
		}
}