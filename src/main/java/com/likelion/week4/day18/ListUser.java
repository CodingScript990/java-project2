package com.likelion.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
		public static void main(String[] args) {

				// ArrayList 생성 => User type users 객체
				List<User> users = new ArrayList<>();

				User user1 = new User("김무라", "010-1234-1111", 10);

				System.out.println(user1.getName());
				System.out.println(user1.getPhoneNumber());
				System.out.println(user1.getAge());
		}
}
