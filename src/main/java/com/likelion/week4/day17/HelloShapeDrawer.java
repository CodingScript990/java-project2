package com.likelion.week4.day17;

import java.io.IOException;

public class HelloShapeDrawer {

		// Function 1 [반복하는 메서드]
		// interface 사용을 할려면 IOException 예외처리를 해줘야함
		public void repeatMsg(int n, String msg) { // parameter[n, msg]

				// n 번 받아서 반복해주는 작업
				for (int i = 0; i < n; i++) {
						System.out.println(msg);
				}
		}
}
