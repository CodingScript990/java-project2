package com.likelion.week2.day6;

public class BooleanEx {
		public static void main(String[] args) {
				// Boolean type => Input
				boolean flag1 = false;
				boolean flag2 = true;

				boolean isPaymentSuccess = true;
				boolean isBalanceSufficient = false;

				// output
				System.out.println("flag1 = " + flag1);
				System.out.println("flag2 = " + flag2);
				System.out.println("isPaymentSuccess = " + isPaymentSuccess);
				System.out.println("isBalanceSufficient = " + isBalanceSufficient);

				// 성인 인지 체크?

				int age = 30; // 나이
				boolean isAdult = age >= 18; // 조건(성인이냐?)

				// output
				System.out.println("isAdult = " + isAdult);
		}
}
