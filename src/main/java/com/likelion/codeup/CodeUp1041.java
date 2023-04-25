package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1041 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				char aArpabet = sc.nextLine().charAt(0);

				int iArpabet = Character.valueOf(aArpabet);

				System.out.println((char)(iArpabet + 1));
		}
}
