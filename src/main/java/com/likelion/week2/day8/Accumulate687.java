package com.likelion.week2.day8;

public class Accumulate687 {
		public static void main(String[] args) {

				// 나머지 누적
				// 변수, 누적, 연산자, 나머지, 몫
				// int type variable 초기값
				int num = 687;
				int answer = 0;

				// 나머지를 먼저 구하기1
				answer = answer + (num % 10);
				// 그 뒤에 몫을 구해야함
				num = num / 10;

				// 68 >> 10으로 나눈 나머지 8
				System.out.printf("num:%d, answer:%d\n", num, answer);

				// 나머지를 먼저 구하기2
				answer = answer + (num % 10);
				// 그 뒤에 몫을 구해야함
				num = num / 10;

				// 68 >> 10으로 나눈 나머지 8
				System.out.printf("num:%d, answer:%d\n", num, answer);

				// 나머지를 먼저 구하기3
				answer = answer + (num % 10);
				// 그 뒤에 몫을 구해야함
				num = num / 10;

				// 68 >> 10으로 나눈 나머지 8
				System.out.printf("num:%d, answer:%d\n", num, answer);
		}
}
