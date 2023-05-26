package com.likelion.week6.day28.interfaceex;

// May.26 2023
public class Circle implements Shape {

		private double radius;

		public Circle(double radius) {
				this.radius = radius;
		}

		@Override
		public double calculateArea() {
				return Math.PI * radius * radius;
		}

		@Override
		public double calculatePerimeter() {
				return 2 * radius * Math.PI;
		}
}
