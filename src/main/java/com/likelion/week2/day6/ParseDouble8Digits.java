package com.likelion.week2.day6;

public class ParseDouble8Digits {
		public static void main(String[] args) {
				String val1 = "1.111111111"; // 소수점 여덟 자리
				String val2 = "2.111111111"; // 소수점 여덟 자리

				// Float type
				float rFloat = Float.parseFloat(val1) + Float.parseFloat(val2);

				// output
				System.out.println(rFloat);

				// double type
				double rDouble = Double.parseDouble(val1) + Double.parseDouble(val2);

				// output
				System.out.println(rDouble);
		}
}
