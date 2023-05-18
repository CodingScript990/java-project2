package com.likelion.codeup.week5.day23;

// 괄호풀기 문제
				/*
							()() – 짝이 맞음 true
							(())() – 짝이 맞음 true
							)()( – 짝이 안맞음 false
							(()( – 짝이 안맞음 false
				*/

public class ParenthesisEx {
		public static void main(String[] args) {

				String brackets = "((()()))())";

				while (brackets.indexOf("()") != -1) {
						String[] split = brackets.split("\\(\\)");
						brackets = String.join("", split);
						System.out.println(brackets);
				}

		}
}
