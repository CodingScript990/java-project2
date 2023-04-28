package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1070 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// int type initial value
				int inputSeason = sc.nextInt();

				// Switch statement
				switch (inputSeason) { // int type value
						case 12: case 1: case 2: // Condition 1
								// output
								System.out.println("winter");
								// stop
								break;
						case 3: case 4: case 5: // Condition 2
								// output
								System.out.println("spring");
								// stop
								break;
						case 6: case 7: case 8: // Condition 3
								// output
								System.out.println("summer");
								// stop
								break;
						case 9: case 10: case 11: // Condition 4
								// output
								System.out.println("fall");
								// stop
								break;
				}
		}
}
