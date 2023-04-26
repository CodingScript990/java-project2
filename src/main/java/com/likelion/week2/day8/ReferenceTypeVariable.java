package com.likelion.week2.day8;

import com.likelion.project2.PrintHello;

import java.util.Objects;

public class ReferenceTypeVariable {
		public static void main(String[] args) {
				// new 객체를 인스턴스화 => student
				// Student => class
				Student student = new Student();
				// Array => student
				Student[] students = new Student[30];

				// Object Type 은 모든 new object 를 인스턴스화 Call 가능하다!
				// Primitive type 은 class 가 아님!
				// 참조 타입[] 변수명 = new 참조 타입[개수];
				Object obj = new Student();
				Object obj2 = new PrintHello();
		}
}
