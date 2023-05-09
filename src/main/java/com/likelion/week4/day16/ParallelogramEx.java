package com.likelion.week4.day16;

public class ParallelogramEx {
		// 멤버변수 생성[charStar, charZero]
		private String charStar = "*";
		private String charZero = "0";

		// Constructor 생성[charStar, charZero]
		public ParallelogramEx(String charZero, String charStar) {
				this.charZero = charZero;
				this.charStar = charStar;
		}

		// makeALine method add
		public String makeALine(int height, int i){
				return String.format("%s%s", charZero.repeat(i), charStar.repeat(height));
		}

		// printShape method add
		public void printShape(int height, String charZero, String charStar) {
				for (int i = 0; i < height; i++) {
						System.out.println(makeALine(height, i));
				}
		}

		// Main method
		public static void main(String[] args) {
				// 평행사변형

				ParallelogramEx pr = new ParallelogramEx("*", "0");

				//int height = 4;

				pr.printShape(5, "0", "*");
		}
}
