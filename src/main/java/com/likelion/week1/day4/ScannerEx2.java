package com.likelion.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
		// inputTwoNumbersAndPlus method add
		void inputTwoNumbersAndPlus() {
				// Input
				Scanner sc = new Scanner(System.in);
				// output message
				System.out.println("두개의 숫자를 입력하세요. 입력하고 Enter 입력하고 Enter");
				System.out.println("첫번째 숫자: ");
				System.out.println("첫번째 숫자는 " + sc.nextInt() + "입니다.");
				System.out.println("두번째 숫자: ");
				System.out.println("두번째 숫자는 " + sc.nextInt() + "입니다.");
				// output[int type]
				System.out.println(sc.nextInt() + sc.nextInt());
		}
}
