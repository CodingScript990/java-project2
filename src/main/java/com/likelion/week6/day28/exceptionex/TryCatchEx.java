package com.likelion.week6.day28.exceptionex;
// May.26 2023
public class TryCatchEx extends Exception {

		// parameter 가 없는 상태로 직접 메시지를 남기는 것[변동 X]
		public TryCatchEx() {
				super("error");
		}

		// parameter 가 있어 직접적으로 메시지를 남기는 것이 아니라
		// 원하는 에러 메시지를 호출로 설정이 가능하다는 의미[변동가능성]
		public TryCatchEx(String msg) {
				super(msg);
		}
}
