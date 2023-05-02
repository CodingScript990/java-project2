package com.likelion.week3.day12;

public class While687 {
		public static void main(String[] args) {

				// int type initial value
				int n = 687;
				int answer = 0;

				// while statement
				while (n > 0) {
						// n % 10
						answer += n % 10;
						n /= 10;
				}

				System.out.printf("%d\n", answer);
		}
}
