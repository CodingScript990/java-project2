package com.likelion.week6.day28.exceptionex;

import java.time.LocalDate;
// May.26 2023
class TryCatchExTest {
		public static void main(String[] args) {
				try {
						throwException();
				} catch (TryCatchEx e) {
						System.out.println(LocalDate.now()); // 1
						System.out.println(e.getMessage()); // 2
				}
		}

		// 직접적으로 예외처리를 발생시킬때 메시지를 직접 사용자가 구현!
		public static void throwException() throws TryCatchEx {
				throw new TryCatchEx("사용자 정의 예외 발생");
		}
}