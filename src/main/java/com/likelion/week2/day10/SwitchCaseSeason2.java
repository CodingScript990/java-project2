package com.likelion.week2.day10;

public class SwitchCaseSeason2 {
		public static void main(String[] args) {

				// int initial value
				int month = 3;

				// switch statement
				switch (month) { // condition[int]
						case 12, 1, 2: // condition 1
								// output
								System.out.println("겨울");
								// stop
								break;
						case 3, 4, 5: // condition 2
								// output
								System.out.println("봄");
								// stop
								break;
						case 6, 7, 8: // condition 3
								// output
								System.out.println("여름");
								// stop
								break;
						case 9, 10, 11: // condition 4
								// output
								System.out.println("겨울");
								// stop
								break;
						default: // Other
								// output
								System.out.println("어떤 계절이 있나요? 알려주세요.");
				}
		}
}
