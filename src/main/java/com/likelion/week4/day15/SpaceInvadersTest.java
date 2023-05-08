package com.likelion.week4.day15;

public class SpaceInvadersTest {
		public static void main(String[] args) {
				// SpaceInvaders 참조타입 변수는 = new 인스턴스화를 받아오고
				SpaceInvaders si = new SpaceInvaders();

				// si => method call [moveLeft, moveRight]
				si.moveLeft();
				si.moveRight();

				// output
				System.out.println(si.location);
		}
}
