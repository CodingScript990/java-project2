package com.likelion.week4.day15;

import java.util.Arrays;

public class ArgsPrinter {
		public static void main(String[] args) {
				// args 출력해보기
				// String[] args 로 특정 값들을 넘겨 자바에서 사용 => program arguments [Hello Bye]를 넣으면?
				System.out.println(Arrays.toString(args)); // Hello, Bye 가 출력됨!
				// default => []가 출력됨!
		}
}
