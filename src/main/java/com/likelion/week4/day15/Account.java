package com.likelion.week4.day15;

public class Account {
		// Member Variable setting
		int balance = 2000;
		// public 접근제어자는 boolean 타입인 isSufficient 메소드명으로 설정하여
		public boolean isSufficient() {
				// balance 멤버변수의 값이 1500 보다 크거나 같은지 비교 후 값을 반환해줌!
				return balance >= 1500;
		}
}
