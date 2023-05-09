package com.likelion.codeup.week4.day16;

import java.util.Arrays;

public class CodeUp1098op {
		// Member Variable Setting[private]
		private int[][] arr; // setBeam 에서만 수정하면됨!

		// Constructor add => arr
		public CodeUp1098op(int rowCnt, int colCnt) { // parameter[rowCnt, colCnt]
				// arr 의 rowCnt, colCnt 이 입력값을 받아와 생성준비를 해줌
				this.arr = new int[rowCnt][colCnt];
		}

		// array setting function
		public void setBeam(int l, int direction, int x, int y) { // parameter[l, direction, x, y]
				// loop[for] => arr [rowCnt][colCnt]
				for (int i = 0; i < l; i++) {
						// if statement
						if (direction == 0) { // 가로
								arr[x - 1][y + i - 1] = 1;
						} else { // 세로
								arr[x + i - 1][y - 1] = 1;
						}
				}
		}

		// array print function method
		public void printArr() {
				// loop[for]
				for (int i = 0; i < arr.length; i++) {
						// array 타입 i번째 값을 출력해줌[범위]
						System.out.println(Arrays.toString(arr[i]));
				}
				// 구분선
//				System.out.println("----------------");
		}

		public static void main(String[] args) {
				// 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.

				// int 타입 입력값 셋팅
				int rowCnt = 5;
				int colCnt = 5;

				// 객체(Object)를 사용하기 위한 작업[CodeUp1098 인스턴스화]
				CodeUp1098op code = new CodeUp1098op(rowCnt, colCnt);

				// 참조변수 code 를 사용하여 printArr 메서드를 호출하여 값을 출력해줌
				code.printArr();

				// 참조변수 code 를 사용하여 setBeam 메서드를 호출하여 요구하는 값을 입력받는 작업
				code.setBeam(2, 0, 1, 1);

				// 참조변수 code 를 사용하여 printArr 메서드를 호출하여 값을 출력해줌
				code.printArr();

				// 참조변수 code 를 사용하여 setBeam 메서드를 호출하여 요구하는 값을 입력받는 작업
				code.setBeam(3, 1, 2, 3);

				// 참조변수 code 를 사용하여 printArr 메서드를 호출하여 값을 출력해줌
				code.printArr();

				// 참조변수 code 를 사용하여 setBeam 메서드를 호출하여 요구하는 값을 입력받는 작업
				code.setBeam(4, 1, 2, 5);

				// 참조변수 code 를 사용하여 printArr 메서드를 호출하여 값을 출력해줌
				code.printArr();
		}
}
