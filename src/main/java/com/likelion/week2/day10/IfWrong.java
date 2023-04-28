package com.likelion.week2.day10;

public class IfWrong {
		public static void main(String[] args) {

				// int type initial value
				int score = 81;

				// if statement
				if (score >= 90) { // 논리값 90 보다 크거나 같은가?
						// True 일때
						System.out.println("A");
				}

				// if statement
				if (score >= 80) { // 논리값 80 보다 크거나 같은가?
						// True 일때
						System.out.println("B");
				}

				// if statement
				if (score >= 70) { // 논리값 70 보다 크거나 같은가?
						// True 일때
						System.out.println("C");
				}

				/**
				 * if Statement 는 모든 조건을 다 출력함! 즉, 해당되는 논리값들을 모두 출력해준다는 의미!
				 * 그래서, if Statement 만 사용하는게 아니라 if-else 문으로 대처함!
				 */
		}
}
