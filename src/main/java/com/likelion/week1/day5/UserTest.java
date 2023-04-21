package com.likelion.week1.day5;

public class UserTest {
		public static void main(String[] args) {
				// 인스턴스화 => User Class => object[variable => name, phoneNumber, age]
				// user1
				User user = new User();

				user.name = "Kim";
				user.phoneNumber = "010-1234-5678";
				user.age = 28;

				// user2
				User user1 = new User();

				user1.name = "jin";
				user1.phoneNumber = "010-2222-4444";
				user1.age = 26;

				// 성인 기준 만18세
				System.out.printf("%s님은 성인 입니까? %s\n", user.name, user.isAdult());
				System.out.printf("%s님은 성인 입니까? %s\n", user1.name, user1.isAdult());
		}
}
