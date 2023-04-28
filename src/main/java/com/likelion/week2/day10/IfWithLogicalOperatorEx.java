package com.likelion.week2.day10;

import java.util.Scanner;

public class IfWithLogicalOperatorEx {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int bCompany = sc.nextInt();
				int bProject = sc.nextInt();

				// if statement
				if (bCompany > 5 || bProject > 10) { // Condition 1
						// output[True]
						System.out.println("팀장 승진 대상입니다.");
				} else if (bCompany < 5 || bProject > 10) { // Condition 2
						// output[True]
						System.out.println("팀장 승진 대상입니다.");
				} else if (bCompany > 5 || bProject < 10) { // Condition 3
						// output
						System.out.println("팀장 승진 대상입니다.");
				} else { // Other
						// output
						System.out.println("팀장 승진 대상이 아닙니다.");
				}
		}
}
