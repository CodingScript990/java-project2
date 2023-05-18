package com.likelion.codeup.week5.day23;

// 괄호풀기 문제
				/*
							()() – 짝이 맞음 true
							(())() – 짝이 맞음 true
							)()( – 짝이 안맞음 false
							(()( – 짝이 안맞음 false
				*/

public class Parenthesis {
		public static void main(String[] args) {

				String brackets = "((((()))))";
				String result;

				while (brackets.indexOf("()") != -1) {
						brackets = brackets.replace("()", "");
				}

				result = (brackets.length() == 0 ? "올바른 괄호 입니다." : "올바른 괄호가 아닙니다.");

				System.out.println(result);
		}
}
