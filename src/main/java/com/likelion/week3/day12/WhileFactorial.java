package com.likelion.week3.day12;

public class WhileFactorial {
		public static void main(String[] args) {

				// 5! = 120

				// int initial value => [n, answer]
				int n = 5;
				int answer = 1;

				// while statement
				while (n > 0) { // condition[조건식]
						answer *= n; // 1 * 5, 5 * 4, ..., 120 * 1
						/*
							1(answer) * 5(n)
						  5(answer) * 4(n)
						  20(answer) * 3(n)
						  60(answer) * 2(2)
						  120(answer) * 1(n)
						 */
						n--; // 감소식 5 - 1, 4 - 1, ... 1 - 1
						/*
						   n : 5 /
							 n : 4 /
						   n : 3 /
						   n : 2 /
							 n : 1
						*/
				}
				System.out.printf("answer:%d\n", answer); // answer => 120
		}
}
