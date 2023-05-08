package com.likelion.week4.day15;

public class Payment {
		public static void main(String[] args) {

				// Account 타입 account 변수는 new Account 인스턴스화를 불러와줌
				Account account = new Account();

				// boolean 타입 isSufficient 변수명을 설정하고 account.isSufficient 메소드를 호출하여 출력시 호출되도록 설정함
				boolean isSufficient = account.isSufficient();

				// if statement => account.isSufficient()
				// 즉, 값이 true 인가? false 인가를 물음
				if (isSufficient) {
						// True 이면 호출
						System.out.println("결제 처리 합니다.");
				} else {
						// False 이면 호출
						System.out.println("잔액이 부족합니다.");
				}

				// output[출력]
				// 결과는 Account 의 멤버변수 balance 는 2000 이고 isSufficient 에서 return 받는 값은
				// 1500 보다 크냐 같냐 이기 때문에 2000은 1500보다 크기에 true 가 되어 "결제 처리 합니다."가 출력됨을 알 수 있음!
		}
}
