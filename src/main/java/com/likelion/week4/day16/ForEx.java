package com.likelion.week4.day16;

public class ForEx {
		// private 멤버변수 설정
		private String spaceChar = "0";

		// 생성자를 이용한 멤버변수(상태값) 바꾸기
		public ForEx(String spaceChar) {
				this.spaceChar = spaceChar;
		}
		// private 멤버변수 설정[ForEx Class 내에서만 사용가능!]
		private String spaceStar = "*";

		// makeALine 출력을 해주는 메서드 생성
		public String makeALine(int height, int i) {
				// repeat 메소드를 이용하여 반복작업을 하도록 만들어줌
				return String.format("%s%s", spaceChar.repeat(height - i - 1), spaceStar.repeat(2 * i + 1));
		}

		// 피라미드 출력 함수를 만들어 피라미드모양이 출력되도록 해줌
		public void printPyramid(int height, String spaceChar, String spaceStar) {
				// For 문을 이용하여 별모양 출력
				for (int i = 0; i < height; i++) {
						System.out.println(makeALine(height, i));
				}
		}

		// Main Method
		public static void main(String[] args) {

				// ForEx 참조타입 pyramid 참조변수를 설정하여 new ForEx 인터페이스화 된 상태를 불러와줌
				ForEx pyramid = new ForEx(" ");
				ForEx pyramidSpaceZero = new ForEx("0");

				// pyramid 참조변수를 활용하여 printPyramid 출력함수를 이용하여 사용자가
				// 지정한 입력값 만큼 출력되도록 함
				pyramid.printPyramid(4, " ", "*");
				pyramidSpaceZero.printPyramid(5, "0", "*");
		}
}
