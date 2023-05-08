package com.likelion.week4.day15;

public class UserFactory {
		// public 접근제어자는 User 참조타입이 getAdultUser 라는 Method Name 을 만들어줌
		public User getAdultUser() {
				// User 참조타입은 user 라는 변수명을 만들고 new User 인스턴스화를 불러와 user 라는 변수에게 대입시켜 호출 시 사용할 수 있게 setting 함
				User user = new User();
				// user 변수는 User 참조타입에서 멤버변수를 불러와 원하는 값을 대입 시켜주고
				user.age = 30;
				// getAdultUser method 호출시 user 변수의 값을 반환해준다
				return user;
		}
}
