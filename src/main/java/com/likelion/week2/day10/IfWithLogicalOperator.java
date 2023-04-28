package com.likelion.week2.day10;

public class IfWithLogicalOperator {
		public static void main(String[] args) {

				// int type setting
				int x = 5;
				int y = 10;

				// if statement
				if (x > 0 && y > 0) { // condition 1
						// output[True]
						System.out.println("x와 y는 모두 양수입니다.");
				}

				// if statement
				if (x > 0 || y > 0) { // condition 2
						// output[True]
						System.out.println("x와 y중 적어도 하나는 양수입니다.");
				}

				// if statement
				if (!(x > 0)) { // condition 3
						// output[True]
						System.out.println("x는 음수 또는 0입니다.");
				}

		}
}
