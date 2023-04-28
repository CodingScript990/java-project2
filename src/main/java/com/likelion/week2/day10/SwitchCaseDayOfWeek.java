package com.likelion.week2.day10;

public class SwitchCaseDayOfWeek {
		public static void main(String[] args) {

				// int initial value
				int dayOfWeek = 2;

				// switch cass statement
				switch (dayOfWeek) { // 변수 or 식
						case 1: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("월요일");
								break;
						case 2: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("화요일");
								break;
						case 3: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("수요일");
								break;
						case 4: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("목요일");
								break;
						case 5: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("금요일");
								break;
						case 6: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("토요일");
								break;
						case 7: // Value 를 설정
								// Value 에 해당하는 경우 실행할 코드
								System.out.println("일요일");
								break;
						default: // 어떤 case 에도 해당되지 않는 경우
								// 어떤 case 에도 해당되지 않는 경우 실행할 코드
								System.out.println(dayOfWeek + "에 해당하는 요일은 없습니다.");
				}
		}
}
