package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1019 {
		public static void main(String[] args) {
				// Input => Scanner
				Scanner sc = new Scanner(System.in);

				// Input => String type 으로 값을 받고
				String strSplit = sc.nextLine();

				// 특정 문자를 기준점으로 하는 String Array 로 값을 받는데,
				String[] strDateTime = strSplit.split("\\.");

				// strDateTime Array 중 index 0 방은 year 로 값을 정수형으로 받아주고
				int year = Integer.valueOf(strDateTime[0]);
				// strDateTime Array 중 index 1 방은 month 로 값을 정수형으로 받아주고
				int month = Integer.valueOf(strDateTime[1]);
				// strDateTime Array 중 index 2 방은 day 로 값을 정수형으로 받아주고
				int day = Integer.valueOf(strDateTime[2]);

				// output => year 은 4자리를 받는 형태로, month, day 는 2자리를 받는데, 한자리를 입력하면
				// 2자리로 나오는데 앞에 0을 넣어주는 형태로 만들어서 출력해줘라!
				System.out.printf("%04d.%02d.%02d", year, month, day);
		}
}
