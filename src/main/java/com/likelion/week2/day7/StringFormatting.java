package com.likelion.week2.day7;

public class StringFormatting {
		public static void main(String[] args) {
				String name = "Kim";
				int balance = 2_500_000;
				String rs = String.format("이번달 %s님의 월급은 %d원 입니다.", name, balance);

				System.out.println(rs);
		}
}
