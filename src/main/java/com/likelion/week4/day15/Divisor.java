package com.likelion.week4.day15;

public class Divisor {
		// 약수의 합을 리턴하는 메소드
		int sumOfFactors(int num) { // int num[매개변수]
				// num % i == 0 이면 약수
				// 12 --> 1 2 3 4 6 12

				// int 타입 setting => 약수의 합을 구해주기 위함임!
				int answer = 1;

				// For statement
				for (int i = 2; i <= num; i++) {
						// 12의 약수 조건
						if (num % i == 0) answer += i;
				}
				// answer 는 if 조건문의 i 값을 반환해줌
				return answer;
		}

		// 출력해주는 메소드
		void printResult(int num) { // int num[매개변수]
				// 출력해주는 내부 코드
				System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
		}

		// Main method
		public static void main(String[] args) {
				
				// Divisor 참조타입 변수명은 divisor 이고, new Divisor 의 인스턴스화를 불러와서 사용해주기 위한 작업
				Divisor divisor = new Divisor();

				// divisor 은 Divisor 에서 설정한 method 를 호출하는데 호출전에 사용자가 값을 넣고 출력해줌
				divisor.printResult(12);
				divisor.printResult(36);
				divisor.printResult(48);
				divisor.printResult(29);
		}
}
