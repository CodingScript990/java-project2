package com.likelion.week4.day15;

public class SpaceInvaders {
		// Method add
		// int type initial value
		int location;

		// moveLeft function add
		// public : 이 함수를 어디까지 접근할 수 있는지를 명시하는 것임
		// void : 함수가 끝날 때 리턴값이 없다는 의미임
		// 즉, 어떤 타입을 사용하더라도 상관없다는 의미
		public void moveLeft() {
				// 값을 출력해주는 작업!
				location -= 1;
		}

		// moveRight function add
		public void moveRight() {
				// 값을 출력해주는 작업!
				location += 1;
		}
}
