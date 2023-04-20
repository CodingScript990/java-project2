package com.likelion.week1.day4;

public class PrintfDate {
		public static void main(String[] args) {
				// printf date
				System.out.printf("%d\n", 4); // date 1자리만
				System.out.printf("%02d\n", 4);
				System.out.printf("%02d\n", 11); // date 2자리만
				// output => 2023-04-20
				System.out.printf("%d-%02d-%02d\n", 2023, 4, 20);
		}
}
