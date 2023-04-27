package com.likelion.week2.day9;

public class LogicalOperatorEx {
		public static void main(String[] args) {

				// int type setting[초기값]
				int age = 25; // Initial value = 25;
				// boolean type setting[초기값]
				boolean isStudent = false; // Initial value = false;

				// if 조건문으로 결과값 출력
				if (age >= 18 && !isStudent) { // ! : 부정연산자[현재 상태에서 반대로 표현한다고 생각하면 됨]
						// output
						// 25 >= 18? True 이면 출력!
						System.out.println("성인이며 학생이 아닙니다!");
				}

				/**
				 * &[추천안함]
				 * 1. 앞의 조건식이 false 여도 뒤의 조건식이 True 인지 False 인지 판별함
				 * 2. 결과는 false 인데도 체크함

				 * &&[추천함]
				 *    1. 앞의 조건식이 false 라면, 뒤의 조건식은 True 인지 False 인지 신경쓰지 않음!
				 *    2. 결과는 false 이기 때문임
				 */
		}
}
