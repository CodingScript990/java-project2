package com.likelion.week2.day9;

public class CheckWhetherAdult {
		// Refactoring => boolean type[userAge 비교]
		public static boolean adPrint(int adFirst) {

				int adNumOne = 18; // 만 18세 이상

				// boolean type => Operator
				// adFirst => userAge
				boolean result = adFirst >= adNumOne; // 31 >= 18

				// return Value
				return result;
		}
		public static void main(String[] args) {

				// int type Initial value
				int userAge = 31; // user 의 나이는 31세

				// boolean type => Check
				boolean isAdult = adPrint(userAge); // true, false

				// output
				// 31 >= 18 !userAge => user
				System.out.printf("미성년자 입니까? %b\n", !isAdult);
		}
}
