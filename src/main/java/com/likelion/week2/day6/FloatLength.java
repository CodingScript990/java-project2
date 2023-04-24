package com.likelion.week2.day6;

public class FloatLength {
		public static void main(String[] args) {
				// Input => float, double
				float f1 = 3.141592653589793f; // 7 자리 => 표현
				double d1 = 3.145926535897934554524154; // 16 자리 => 표현

				// Output
				System.out.println("f1:" + f1);
				// f 를 붙이면 7자리 초과하면 반올림 된다느느 것을 알고 코딩하라는 의미
				System.out.println("d1:" + d1);
		}
}
