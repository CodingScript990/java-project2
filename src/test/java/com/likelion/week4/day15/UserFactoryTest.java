package com.likelion.week4.day15;

class UserFactoryTest {
		// main method
		public static void main(String[] args) {
				// UserFactory 참조타입 userFactory 라는 변수를 설정하고 new UserFactory 인스턴스화를 불러와 UserFactory 에서 설정한 멤버변수를
				// 사용할 수 있도록 userFactory 변수에게 대입 받음
				UserFactory userFactory = new UserFactory();

				// User 타입 user1 이라는 변수를 설정하고 userFactory 참조변수에게서 getAdultUser 메소드 호출하게 만들어 user1 변수가 userFactory 의
				// 멤버변수를 사용할 수 있도록 대입 받음
				User user1 = userFactory.getAdultUser();

				// output user1 변수는 userFactory 에게서 getAdultUser 메소드 중 User 의 매개변수를 들고와 User Class 에서 설정한 매개변수를 
				// 호출하여 출력되도록 만들어 줌
				System.out.println(user1.age);
		}
}