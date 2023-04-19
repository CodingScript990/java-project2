package com.likelion.week1;

import java.util.Scanner;

public class ScannerEx {
		public void plusTwoNumbers(int val1, int val2) {

		}

		// Method naming 작성시 유의!
		public void readTwoNumbersAndPlus() {
				// Scanner 를 이용하여, number 2개 input
				Scanner sc = new Scanner(System.in);
				// Output => int type[sc1, sc2]
				System.out.println(sc.nextInt() + sc.nextInt());
		}
}
