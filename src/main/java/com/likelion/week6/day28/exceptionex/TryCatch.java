package com.likelion.week6.day28.exceptionex;
// May.26 2023
public class TryCatch {
		public static void main(String[] args) {

				try {
						throw new Exception();
				} catch (Exception e) {
						e.printStackTrace(); // Checked Exception 이 필수! 예외처리 필수!
				}

				try {
						throw new RuntimeException(); // Unchecked Exception 은 필수가 아님
				} catch (Exception e) {

				}
		}
}
