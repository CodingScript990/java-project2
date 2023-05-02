package com.likelion.codeup.week3.day12;

import java.util.Scanner;

public class CodeUp1278 {
		public static void main(String[] args) {

				// Scanner 클래스를 이용하여, 사용자가 사용할 입력소스를 지정해주기 위한 것이다.
				Scanner sc = new Scanner(System.in);

				// Scanner 를 사용하여 정수형 입력을 받아 inputNum 변수에 저장할것이라는 의미이다.
				int inputNum = sc.nextInt();
				// 정수형 변수 cnt 를 선언하고 0으로 초기화 해준다는 의미이다.
				int cnt = 0;

				// while 문을 사용한다.
				while (inputNum > 0) { // inputNum 변수의 값이 0보다 크면 반복한다는 의미이다.
						inputNum = inputNum / 10; //1. inputNum 변수에서 가장 오른쪽 자리 수를 없앤다는 의미이다.
						//2. inputNum 변수의 값을 10으로 나눈 후, 그 결과를 다시 inputNum 변수에 할당하는 코드이다.
						cnt++; // cnt 의 변수를 1씩 증가시켜준다는 의미이다
				}
				// 출력결과
				System.out.printf("%d\n", cnt); // 변수의 값을 출력시켜준다
		}
}
