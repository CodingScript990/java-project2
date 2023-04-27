package com.likelion.week2.day9;

public class CompoundAssignmentOperator {
		public static void main(String[] args) {

				// 복합 대입연산자
				// int type 초기값
				int x = 10; // Variable => x

				// 덧셈 후 대입
				x += 1; // += : Operator

				// 10 + 1
				System.out.printf("+= 1 %d\n", x); // Operand[피연산자] = 11

				// 뺄셈 후 대입
				x -=5; // -= : Operator

				// 11 - 5
				System.out.printf("-= 5 %d\n", x); // Operand[피연산자] = 6

				// 곱셉 후 대입
				x *= 2; // *= : Operator

				// 6 X 2
				System.out.printf("*= 2 %d\n", x); // Operand[피연산자] = 12

				// 나눗셈 후 대입
				x /= 3; // /= : Operator

				// 12 / 3
				System.out.printf("/= 3 %d\n", x); // Operand[피연산자] = 4

				// 나머지 연산 후 대입
				x %= 8; // %= : Operator

				// 4 % 8
				System.out.printf("%%= 8 %d\n", x); // Operand[피연산자] = 4
		}
}
