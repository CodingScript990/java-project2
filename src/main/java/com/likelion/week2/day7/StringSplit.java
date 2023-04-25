package com.likelion.week2.day7;

public class StringSplit {
		public static void main(String[] args) {
				// String type
				String str = "10 3 19 28 7 488";
				// String Array
				String[] strArr = str.split(" ");

				// output => String index[i]
				System.out.println(strArr[0]);
				System.out.println(strArr[1]);
				System.out.println(strArr[2]);
				System.out.println(strArr[3]);
				System.out.println(strArr[4]);
				System.out.println(strArr[5]);
		}
}
