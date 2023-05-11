package com.likelion.week4.day18;

public class User {
		private String name;
		private String phoneNumber;
		private String password;
		private int age;

		// Constructor
		public User(String name, String phoneNumber, int age) {
				this.name = name;
				this.phoneNumber = phoneNumber;
				this.age = age;
		}

		// Constructor basic
		public User() {
				this.name = name;
				this.phoneNumber = phoneNumber;
				this.age = age;
		}

		// Getter
		public String getName() {
				return name;
		}

		public String getPhoneNumber() {
				return phoneNumber;
		}

		// password 는! 항상 직접 접근이 아니라 접근제어 로직을 넣어줘야함!(getter, setter)
		public String getPassword() {
				// 접근 제어 로직을 짜서 접근이 나만 알도록![직접 접근은 지양함!!하지말라]
				return password;
		}

		public int getAge() {
				return age;
		}

		// Setter
		public void setName(String name) {
				this.name = name;
		}

		public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
		}

		// password 는! 항상 직접 접근이 아니라 접근제어 로직을 넣어줘야함!(getter, setter)
		public void setPassword(String password) {
				// 접근 제어 로직을 짜서 접근이 나만 알도록![직접 접근은 지양함!!하지말라]
				this.password = password;
		}

		public void setAge(int age) {
				this.age = age;
		}

		// boolean type method
		// 필요한 것만 구현해 만듬(isAdult 처럼!)
		// 구체적으로 필요없는 경우, 비즈니스 로직을 태운 메소드만 만들고 getAge()와 같은 Getter 는 만드는 것을 지양함
		boolean isAdult() {
				return age >= 18;
		}
}
