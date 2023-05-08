package com.likelion.codeup.week4.day15;

import java.util.Scanner;

public class CodeUp1671 {
		// win, tie, lose
		public String play(int user, int computer) {

				// User 가 computer 모두 이긴 경우, 비긴 경우, 진 경우
				if (user == 0 && computer == 1) {
						// win
						return "win";
				} else if (user == 1 && computer == 2) {
						// win
						return "win";
				} else if (user == 2 && computer == 0) {
						// win
						return "win";
				} else if (user == computer) {
						// tie
						return "tie";
				} else {
						// lose
						return "lose";
				}

				/*
				int flag = user - computer;

				switch (flag) {
						case 0: return "tie";
						case -1: return "win";
						case 1, -2: return "lose";
						default: return "Error";
				}
				 */
		}
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				CodeUp1671 rock = new CodeUp1671();

				// 바위 0 / 가위 1 / 보 2
				int user = sc.nextInt();
				int computer = sc.nextInt();

				System.out.println(rock.play(user, computer));
		}
}
