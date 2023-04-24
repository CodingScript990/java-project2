package com.likelion.week2.day6;

public class NumberFormatException1 {
		public static void main(String[] args) {
				String str = "123ab"; // 숫자가 아닌 것은 에러남
				int numb = Integer.parseInt(str);

				System.out.printf("numb:%d" + numb); // NumberException Error!
		}
}
