package com.likelion.week1.day4;

import java.util.Scanner;

public class AverageEx {
		public static void main(String[] args) {
				// 무조건 Type 에 맞게 작성할 것! Type 이 맞지 않으면 에러남!
				Scanner sc = new Scanner(System.in);
				//
				// System.out.printf("%.1f", (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3);
				System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
		}
}
