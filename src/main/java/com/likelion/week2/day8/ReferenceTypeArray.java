package com.likelion.week2.day8;

import java.util.Arrays;

public class ReferenceTypeArray {
		public static void main(String[] args) {
				// Array 초기화
				Student[] students = new Student[2];

				// Student Class 초기화[0]
				students[0] = new Student();
				students[0].name = "GreatestCommonDivisor"; // Student Class 초기화 후 Class type 사용!
				students[0].phoneNumber = "010-1234-5678";
				students[0].age = 20;

				// Student Class 초기화[1]
				students[1] = new Student();
				students[1].name = "LeastCommonMultiple";
				students[1].phoneNumber = "010-1111-2222";
				students[1].age = 21;

				// output => 각 Student Class type call
				System.out.println(students[0].name);
				System.out.println(students[1].name);
		}
}
