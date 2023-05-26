package com.likelion.week6.day28.interfaceex;
// May.26 2023
public interface Shape {
		double calculateArea();
		double calculatePerimeter();

		default void display() {
				System.out.println("디폴트 메서드");
		}
}
