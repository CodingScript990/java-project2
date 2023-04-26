package com.likelion.codeup.week2.day7;

import java.util.Scanner;
// 2023.4.25
public class CodeUp1041 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				char aArpabet = sc.nextLine().charAt(0);

				int iArpabet = Character.valueOf(aArpabet);

				System.out.println((char)(iArpabet + 1));
		}
}
