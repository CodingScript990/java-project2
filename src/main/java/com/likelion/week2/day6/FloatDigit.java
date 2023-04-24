package com.likelion.week2.day6;

public class FloatDigit {
		public static void main(String[] args) {

				// Input => float, double
				float f5 = 1.23e5f;
				float f6 = 1.23e6f;
				float f7 = 1.23e7f;
				float f8 = 1.23e8f;
				float f9 = 1.23e9f;
				float f10 = 1.23e10f; // float 이 아니라 Double 로 답아줌
				double d10 = 1.23e10;

				// output
				System.out.printf("f5:%f\n", f5);
				System.out.printf("f6:%f\n", f6);
				System.out.printf("f7:%f\n", f7);
				System.out.printf("f8:%f\n", f8);
				System.out.printf("f9:%f\n", f9);
				System.out.printf("f10:%f\n", f10);
				System.out.printf("d10:%f\n", d10);

				// float 값이 크게 설정이 되더라도 출력값이 짤림!
		}
}
