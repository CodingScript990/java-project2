package com.likelion.week2.day10;

public class GetGrade {
		public static void main(String[] args) {

				// int type initial value
				int score = 75;

				// if statement
				if (score >= 90) { // 논리값이 90보다 크거나 같은가?
						// True 일때
 						System.out.println("A");
				} else if (score >= 80) { // 논리값이 80보다 크거나 같은가?
						// True 일때
						System.out.println("B");
				} else if (score >= 70) { // 논리값이 70보다 크거나 같은가?
						// True 일때
						System.out.println("C");
				} else { // 그외 해당되지 않는 논리값
						// False 일때
						System.out.println("F");
				}
				/**
				* if Statement 를 사용할때에는 순서대로 실행되기에 논리값이 조건에 해당되면
				 * 그 즉시 종료되기에 항상 유의하여 코드를 짜기!
				*/
		}
}
