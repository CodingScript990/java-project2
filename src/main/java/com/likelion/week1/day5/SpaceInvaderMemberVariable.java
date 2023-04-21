package com.likelion.week1.day5;

public class SpaceInvaderMemberVariable {
		// 멤버변수(Member Variable)
		int location; // Class 의 멤버변수
		public final int MAX_LEVEL = 3; // 상수인 멤버변수

		// input => moveLeft method
		public void moveLeft() { // Call => 1
				location = location - 1; // 1. -1
		}

		// 리팩토링을 하기 위한 작업!
		// output => moveAndLeftPrint method
		public void moveAndLeftPrint() {
				moveLeft();
				System.out.printf("moveLeft: %d\n", location);
		}

		// input => moveRight method
		public void moveRight() { // Call => 4
				location = location + 1; // 2. 1 - 1 = 0
																 // 3. 1 + 0 = 1
															   // 4. 1 + 1 = 2
															   // 5. 1 + 2 = 3
		}

		// output => moveAndRightPrint method
		public void moveAndRightPrint() {
				moveRight();
				System.out.printf("moveRight: %d\n", location);
		}

		// Main method
		public static void main(String[] args) {
				// 인스턴스화
				SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
				// call => method(member variable => [value,print])
				simv.moveAndLeftPrint(); // -1
				simv.moveAndRightPrint(); // 0 => 1 - 1
				simv.moveAndRightPrint(); // 1 => 1 + 1
				simv.moveAndRightPrint(); // 2 => 1 + 2
				simv.moveAndRightPrint(); // 3

				// 최종 멤버변수의 위치 와 값을 알고 싶을때!
				System.out.printf("최종 위치: %d\n", simv.location); // 3

				simv.moveAndLeftPrint(); // 3 - 1 = 2

				System.out.printf("최종 위치: %d\n", simv.location); // 2
		}
}
