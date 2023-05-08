package com.likelion.week4.day15;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
		public static void main(String[] args) {
				// User 참조변수를 user1 으로 설정하고 new User 인스턴스화 상태를 받아옴
				User user1 = new User();

				// user1 참조변수는 User 의 멤버변수를 불러와 차례로 원하는 값을대입 시켜줌
				user1.name = "김미미";
				user1.phoneNumber = "010-1234-5678";
				user1.age = 20;

				// User 참조변수를 user2 으로 설정하고 new User 인스턴스화 상태를 받아옴
				User user2 = new User();

				// user2 참조변수는 User 의 멤버변수를 불러와 차례로 원하는 값을대입 시켜줌
				user2.name = "김나나";
				user2.phoneNumber = "010-1111-2222";
				user2.age = 10;

				// output => 각 참조변수의 멤버변수를 호출하여 boolean 타입 Method 로 성인이면 true, 아니라면 false 가 나오도록 출력해줌
				System.out.printf("%s는 어른인지? %b\n%s의 번호는? %s\n", user1.name, user1.isAdult(), user1.name, user1.phoneNumber);
				System.out.printf("%s는 어른인지? %b\n%s의 번호는? %s\n", user2.name, user2.isAdult(), user2.name, user2.phoneNumber);
		}

}