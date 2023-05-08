package com.likelion.week4.day15;

public class VariousReturnType {
		// public 접근제어자는 boolean 타입으로 받는 Method Name[isAdult]
		public boolean isAdult() {
				// 반환 값은 true 이다
				return  true;
		}

		// public 접근제어자는 int 타입으로 받는 Method Name[plus]
		public int plus() {
				// 반환 값은 1 + 1 이다
				return 1 + 1;
		}

		// public 접근제어자는 User 타입으로 받는 Method Name[getUser]
		public User getUser() {
				// 반환 값은 new User 인스턴스화를 불러온다[name, phoneNumber, age]
				return new User();
		}

		// public 접근제어자는 void 타입으로 Method Name[printHello]
		public void printHello() {
				// 값을 호출시 출력해준다
				System.out.println("Hello");
		}

		// Main method
		public static void main(String[] args) {

				// VariousReturnType 참조변수 vrt 를 설정해주고 new VariousReturnType 인스턴스화를 불러옴
				VariousReturnType vrt = new VariousReturnType();

				// 각 variable initial settings
				boolean isAdult = vrt.isAdult();
				int plusResult = vrt.plus();
				User user = vrt.getUser();

				// User 참조 타입을 사용하기 위해 call
				// User 참조 타입 변수를 가지고 User 멤버변수를 호출하여 원하는 값을 대입시켜줌!
				user.name = "김나나";
				user.age = 20;

				// output
				System.out.printf("isAdult : %b\n", isAdult);
				System.out.printf("plusResult : %d\n", plusResult);
				System.out.printf("userName : %s\nuserAge : %s\n", user.name, user.age);
				vrt.printHello();
		}
}
