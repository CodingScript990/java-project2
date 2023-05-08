package com.likelion.week4.day15;

public class StarPrintEx2 {
		public static void main(String[] args) {

				int n = 4;

				// n => 4
				for (int i = 0; i < n; i++) {
						// i : 0
						// i : 1
						// i : 2
						// i : 3

						// n - 1 => n - i - 1
						for (int j = 0; j < n - i - 1; j++) {
								// i[0]
								// j : 1 -> " "
								// j : 2 -> " "
								// i[1]
								// j : 0 -> " "
								// j : 1 -> " "
								// i[2]
								// j : 0 -> " "
								// i[3]
								// - -> X
								System.out.print(" ");
						}

						// 2n + 1 => 2 * i + 1
						for (int k = 0; k < 2 * i + 1; k++) {
								// i[0]
								// k : 0 -> *
								// i[1]
								// k : 0 -> *
								// k : 1 -> *
								// k : 2 -> *
								// i[2]
								// k : 0 -> *
								// k : 1 -> *
								// k : 2 -> *
								// k : 3 -> *
								// k : 4 -> *
								// i[3]
								// k : 0 -> *
								// k : 1 -> *
								// k : 2 -> *
								// k : 3 -> *
								// k : 4 -> *
								// k : 5 -> *
								// k : 6 -> *
								System.out.print("*");
						}

						// output
						// i[0] -> \n
						// i[1] -> \n
						// i[2] -> \n
						// i[3] -> \n
						System.out.println();
				}
		}
}
