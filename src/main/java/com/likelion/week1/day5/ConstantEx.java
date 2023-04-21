package com.likelion.week1.day5;

import com.likelion.project2.PrintHello;

public class ConstantEx {
		// 지역변수 => constantEx 안에서만 사용가능
		public final int MAX_lEVEL = 3;
		// 전역변수 => constantEx 외에도 사용이 가능
		public static final int MIN_LEVEL = 1;

		public static void main(String[] args) {
				// constant 상수 => main method 안에 있어서 _naming 을 짓지 않음
				// final => 상수는 재할당이 안됨 => Immutable[불변]
				final int iVal;
				iVal = 1;
				System.out.println(iVal);

				// 값이 변하지 않도록 하기 위한 것
				final PrintHello printHello = new PrintHello();
		}
}
