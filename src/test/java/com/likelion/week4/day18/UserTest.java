package com.likelion.week4.day18;

class UserTest {
		public static void main(String[] args) {

				User user1 = new User();

				user1.setName("김무라");
				user1.setAge(10);

				User user2 = new User();

				user2.setName("김먹나");
				user2.setAge(80);

				System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
				System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());
		}
}