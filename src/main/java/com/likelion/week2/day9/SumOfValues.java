package com.likelion.week2.day9;

public class SumOfValues {
		public static void main(String[] args) {

				// 누적하는 법
				// 누적 합계를 구하기 위한 초기값 설정
				int answer = 0; // 1. 0 / 2. 2 / 3. 3 / 4. 10 / 5. 14
				// int type 배열로 참조값 설정
				int[] arr = {2, 1, 7, 4}; // 2 1 7 4

				// 대입연산자 => answer + arr[i]
				answer = answer + arr[0]; // 2 + 0[answer]
				answer = answer + arr[1]; // 1 + 2[answer]
				answer = answer + arr[2]; // 7 + 3[answer]
				answer = answer + arr[3]; // 4 + 10[answer]

				// 손으로 타이핑을 하면 100개 1000개가 될때 못함..
				// output => answer 의 값
				System.out.printf("answer:%d", answer); // 14[answer]
		}
}
