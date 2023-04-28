package com.likelion.week2.day10;

public class ElseExam2 {
		public static void main(String[] args) {

				// int type initial value
				int account = 1400;

				// if statement
				if (account >= 1500) { // 논리값이 1500원 보다 많거나 같은가
						// 논리값이 True 일때
						System.out.println("잔액을 차감합니다.");
				} else { // 논리값 False 일때
						System.out.println("'잔액이 부족합니다.'를 재생합니다.");
				}
		}
}
