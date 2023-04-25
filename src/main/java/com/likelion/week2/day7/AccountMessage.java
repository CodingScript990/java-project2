package com.likelion.week2.day7;

public class AccountMessage {
		public static void main(String[] args) {
				// String type
				String name = "Kim";
				// int type
				int balance = 2_500_000;

				// String formatting
				String msg = "이번달 " + name + "님의 월급은 " + balance + "원 입니다.";

				// output
				System.out.printf("%s", msg);
		}
}
