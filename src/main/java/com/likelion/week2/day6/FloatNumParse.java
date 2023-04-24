package com.likelion.week2.day6;

public class FloatNumParse {
		public static void main(String[] args) {
				// String type
				String val1 = "1.5";
				String val2 = "2.5";
				String val3 = val1+val2;

				// output
				System.out.printf("val3:" + val3 + "\n"); // String type

				// int type
				//int rs = Integer.parseInt(val1) + Integer.parseInt(val2);

				// output => NumberFormatException Error
				//System.out.printf("rs:%d", rs); // Type Size 가 float 가 더 크기 때문에, int 를 하게되면 Error 가 나게되는게 당연함! Float Size 으로 변환 시켜 계산해줘야함!

				// String type => Float type
				float rs2 = Float.parseFloat(val1) + Float.parseFloat(val2);

				// output
				System.out.printf("rs2:%f\n", rs2); // 1.5 + 2.5 = 4.0

				String iVal1 = "1";
				String iVal2 = "2";

				int iResult = Integer.parseInt(iVal1) + Integer.parseInt(iVal2);
				System.out.println(iResult);
		}
}
