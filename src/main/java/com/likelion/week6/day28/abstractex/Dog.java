package com.likelion.week6.day28.abstractex;

// May.26 2023
public class Dog extends Animal{ // Dog Class 는 Animal 추상 클래스를 상속 받음
		// 추상 메서드 구현
		@Override
		public void makeSound() {
				System.out.println("크릉!");
		}
}
