package com.likelion.week3.day12;

import java.time.LocalDateTime;

public class WhileEx {
		public static void main(String[] args) throws InterruptedException {

				// 초기화식, 증감식 없는 for문
				// 조건식만 있음
				while (true) {
						System.out.println(LocalDateTime.now());
						Thread.sleep(1000);
				}
		}
}
