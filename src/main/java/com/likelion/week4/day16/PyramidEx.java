package com.likelion.week4.day16;

public class PyramidEx {
		// 역피라미드

		// 멤버변수 생성[charStar, charZero]
		private String charStar = "*";
		private String charZero = "0";

		// makeALine 메서드를 생성하여 0, * 문자열이 출력되도록 format 메서드를 활용하여
		// charZero 멤버변수는 i 의 값을 받아오고, charStar 멤버변수는 height + 3 - (i * 2)의 값을
		// 받아 오도록 만들어주고 값을 리턴해줌
		public String makeALine(int height, int i) {
				return String.format("%s%s", charZero.repeat(i), charStar.repeat(2 * (height - i) - 1));
		}

		public String makeParallelogramALine(int height, int i) {
				return String.format("%s%s", charZero.repeat(i), charStar.repeat(height));
		}

		// starPrint 메서드를 생성하여, height parameter 에게 입력값이 주어지면 값이 출력되도록
		// 해주는데, 내부코드에서 반복문을 이용하여 height 입력값 만큼 증가시켜 makeALine 메서드를
		// 이용하여 formatting 된 상태로 원하는 출력이 되도록 해줌
		public void starPrint(int height, String charStar, String charZero) {
				for (int i = 0; i < height; i++) {
//						System.out.println(makeALine(height, i));
						System.out.println(makeParallelogramALine(height, i));
				}
		}

		// Main method
		public static void main(String[] args) {

				// PyramidEx 참조타입 pyramidEx 참조변수를 생성하여 new PyramidEx 인스턴스화 된 상태를
				// 불러와 사용해주기 위한 초기 작업을 실시하고
				PyramidEx pyramidEx = new PyramidEx();

				// pyramidEx 참조변수를 이용하여 PyramidEx 안에 출력해주는 starPrint 메서드를 호출하여
				// 각 parameter 들에게 입력값을 넣어 사용자가 원하는 출력값을 call 해줌!
				pyramidEx.starPrint(5, "0", "*");

		}
}
