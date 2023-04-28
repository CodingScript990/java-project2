package com.likelion.week2.day10;

public class SwitchCaseClinicHours {
		public static void main(String[] args) {

				// String type initial value
				String day = "월";
				String restTime = "휴진";

				// switch case statement
				switch (day) {
						case "월", "화", "목", "금": restTime = "09:30-18:30"; break;
						case "토": restTime = "09:30-13:00"; break;
						case "수", "일": restTime = "휴진"; break;
				}

				// output
				System.out.printf("%s요일은 %s입니다.\n", day, restTime);
		}
}
