package com.likelion.week2.day9;

public class Accumulate687While {
		public static void main(String[] args) {

				// int type 초기값
				int num = 687; // 687
				int answer = 0; // 1. 0 / 2. 7 / 3. 8 / 4. 6 / 5. 21

				// While 반복문
				while (num > 0) { // 1. 687 / 2. 68 / 3. 6 / 4. 0[Finish]
						// 나머지를 먼저 구하기
						answer = answer + (num % 10); // 1. 687 / 2. 68 3. 6
						// 그 뒤에 몫을 구해야함
						num = num / 10; // 1. 68.7 / 2. 6.8 / 3. 6
				}
				// 68 >> 10으로 나눈 나머지 8
				System.out.printf("answer:%d", answer); // 21
		}
}
