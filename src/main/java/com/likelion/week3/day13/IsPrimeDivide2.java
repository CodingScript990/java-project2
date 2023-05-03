package com.likelion.week3.day13;

public class IsPrimeDivide2 {
		public static void main(String[] args) {

				// 소수 / 2 구하기

				int num = 7;
				int factors = 0; // 약수의 개수

				for (int i = 2; i <= num / 2; i++) { // 1 ~ 6까지
						// 1[i]: 7 / 2
						// 2[i]: 7 / 2
						// 3[i]: 7 / 2

						if(num % i == 0) factors++;
						// num 가 i 로 나눴을때 나머지가 0인가를 조건문에서 물음!
						// 나머지가 0이면 factors 를 증가시켜줌!
						System.out.printf("factors:%d\n", factors);
				}

				// output => factors value 결과
				System.out.printf("factors:%d\n", factors);

				// String type => factors 는 나머지가 0인가?
				// True 이면 => num + "은 소수 입니다."
				// False 이면 => num + "은 소수가 아닙니다."
				String result = factors == 0 ? num + "은 소수 입니다." : num + "은 소수가 아닙니다.";

				// output => result 결과
				System.out.printf("%s\n", result);
		}
}
