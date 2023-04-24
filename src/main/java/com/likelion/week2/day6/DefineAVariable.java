package com.likelion.week2.day6;

// Type Setting Class => int, string, float
public class DefineAVariable {
		public static void main(String[] args) {
				// Type 1
				int num = 10;
				String name = "김경록"; // primitive type 쓰듯이 초기화함
				String name2 = new String("김다미"); // parameter : (참조 type)

				// Type 2
				String sOne = new String("1"); // New String
				int iOne = 1; // int type
				float fOne = 1.0f; // float 는 f 를 안붙여주면 double 로 인식해서 에러남!

				System.out.println(iOne == fOne); // 원래는 유효숫자 땜에 에러가남!
		}
}
