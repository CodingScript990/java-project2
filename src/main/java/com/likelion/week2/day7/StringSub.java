package com.likelion.week2.day7;

public class StringSub {
		public static void main(String[] args) {
				// index 출력
				String str = "Hello";

				// output => index[i, j]
				System.out.println(str.substring(0, 1)); // h
				System.out.println(str.substring(0, 2)); // he
				System.out.println(str.substring(1, 3)); // el
				System.out.println(str.substring(3, 5)); // lo
		}
}
