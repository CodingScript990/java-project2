package com.likelion.week3.day14;

import java.util.Arrays;

public class P120852B {
		public static void main(String[] args) {

				// 소인수분해

				int n = 12; // 12
				int divisor = 2; // 2

				int[] arr = new int[n + 1]; // 1. 12
				// 공간을 많이 차지함! => List, Set, Map
				// for 문으로 한계가 있음 i 이슈!! => while 로 바꿈

				// 배열에 집어넣기 위해서 초기값을 셋팅해줌!
				int idx = 0; // 0

				// while 문으로 변경1
				while(n > 1) { // 1. 12 /  2. 6 / 3. 3 / 4. 1(종료)
						// 소인수 분해를 위한 작업
						if (n % divisor == 0) { // 나눠 떨어지는가? 1. 12 % 2 / 2. 6 % 2 / 3. 3 % 3(종료)
								// 배열을 divisor 에게 대입해줌!
								arr[idx++] = divisor; // 1. 2 / 2. 2 / 3. 3(종료)
								n /= divisor; // 1. 12 / 2 / 2. 6 / 2 / 3. 3 / 3(종료)

						} else {
								// 12 --> 6 --> 3 인경우 2로 안나눠지는 예외경우!
								divisor++; // 즉 누적시켜서 종료를 시켜주기 위한 것! // 2 + 1 = 3
						}
				}

				// for 문 변경전! => 이러면 int 값 끝까지 가고 원하는 값이 출력되지 않음!

				/**
						for (int i = 2; n > 1; i++) {
								// 소인수 분해를 위한 작업
								if (n % divisor == 0) { // 나눠 떨어지는가?
										// 배열을 i 에게 대입해줌!
										arr[divisor] = i;
										n /= i;
								}
						}
				 */

				// 한줄로 출력
				for (int i = 0; i < arr.length; i++) System.out.printf("for:%d ", arr[i]);

				// 결과
				System.out.println("while(0포함) : " + Arrays.toString(arr));
				// arr : [2, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
				// n : 12, 6, 3, 0, 0, ...
				// divisor : 2, 2, 3, 0, ...
				arr = Arrays.stream(arr)
								.filter(item -> !(item == 0))
								.toArray();
				System.out.println("while(0제거) : " + Arrays.toString(arr));
		}
}
