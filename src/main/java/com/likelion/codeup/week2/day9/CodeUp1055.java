package com.likelion.codeup.week2.day9;

import java.util.Scanner;

public class CodeUp1055 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type setting
				int opNum = 1;

				// int type input
				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();

				// result  => 삼항 연산자 사용
				int result = inputOne == opNum || inputTwo == opNum ? 1 : 0;

				// output
				System.out.printf("%d\n", result);
		}
}
