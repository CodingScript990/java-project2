package com.likelion.codeup.week2.day9;

import java.util.Scanner;

public class CodeUp1064 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type input
				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();
				int inputThird = sc.nextInt();
//				int inputOne = 3;
//				int inputTwo = -1;
//				int inputThird = 5;

				// minResult  => 삼항 연산자 사용
				int minResult = inputOne > inputTwo ? inputTwo : inputOne;
				// 대입 연산자 + 삼항 연산자로 최소값 구함
				minResult = minResult > inputThird ? inputThird : minResult;

				// output
				System.out.printf("%d\n", minResult);
		}
}
