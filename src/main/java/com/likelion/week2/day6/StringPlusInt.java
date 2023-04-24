package com.likelion.week2.day6;

public class StringPlusInt {
		public static void main(String[] args) {
				// String + int = ?
				System.out.printf("1"+1 + "\n"); // 11

				// int type => int + string?
				//int rs = 1 + "1"; // type error

				// String type = String + int
				String rs = "1" + 1; // String type 이 커서 가능
				System.out.println("rs = " + rs); // 11
				// String 이 int 로 입력 되어 있기 때문임!
				// 큰쪽으로는 자동으로 해주는데, 작은 쪽으로는 수동으로 설정해줘야함!

				// 형변환으로 동일한 타입으로 맞춰 계산해줌!
				int iResult = 1 + Integer.parseInt("1"); // int type 으로 형변환 해줘서 계산
				System.out.printf("%d\n", iResult);
		}
}
