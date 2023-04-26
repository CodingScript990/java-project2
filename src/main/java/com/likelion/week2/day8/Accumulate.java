package com.likelion.week2.day8;

public class Accumulate {
		public static void main(String[] args) {

				// 계좌 입출력 내역
				// int variable 초기값
				int myAccount = 1_000_000; // 1_000_000

				// 대입 연산자
				myAccount -= 500_000; // 1_000_000 - 500_000

				// output
				System.out.println(myAccount); // 500_000

				// 대입 연산자
				myAccount += 4_000_000; // 4_000_000 + 500_000

				// output
				System.out.println(myAccount); // 4_500_000
		}
}
