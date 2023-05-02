package com.likelion.codeup.week3.day12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {
		public static void main(String[] args) throws IOException {

				Scanner sc = new Scanner(System.in);

				int rgbOne = sc.nextInt();
				int rgbTwo = sc.nextInt();
				int rgbThird = sc.nextInt();

				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

				int rgbCount = 0;

				for (int i = 0; i < rgbOne; i++) {
						for (int j = 0; j < rgbTwo; j++) {
								String line = "";
								for (int k = 0; k < rgbThird; k++) {
										line += i + " " + j + " " + k + "\n";
										rgbCount += 1;
								}
								bw.write(line);
								bw.flush();
						}
				}
				System.out.printf("%d\n", rgbCount);
		}
}
