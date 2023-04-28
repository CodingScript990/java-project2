package com.likelion.codeup.week2.day10;

import java.util.Scanner;

public class CodeUp1069 {
		public static void main(String[] args) {
				// Input Instance Object add
				Scanner sc = new Scanner(System.in);

				// String type initial value
				String inputStr = sc.nextLine();

				// Switch statement
				switch (inputStr) { // String type value
						case "A": // A
								// output
								System.out.println("best!!!");
								// stop
								break;
						case "B": // B
								// output
								System.out.println("good!!");
								// stop
								break;
						case "C": // C
								// output
								System.out.println("run!");
								// stop
								break;
						case "D": // D
								// output
								System.out.println("slowly~");
								// stop
								break;
						default: // Other
								// output
								System.out.println("what?");
				}
		}
}
