package com.likelion.week2.day7;

public class StringEquals {
		public static void main(String[] args) {
				// String type
				String strGood = "GOOD";
				String strGood2 = "GOOD";

				System.out.println(strGood == strGood2); // address 비교
				System.out.println(new String("byebye"));

				// Memory Address 끼리 비교하기 때문에 같다고 나오는 것임

				String strGold = "GOLD";
				String strGold2 = "G";

				// boolean
				boolean isSame = strGold.substring(0, 1) == strGold2;

				//output
				// Object 끼리 == 연산자를 이용하여 비교함
				System.out.println(isSame);

				// output
				// Hash 값은 메모리 특정 주소값을 보여줌
				// equals 를 이용하여 객체 주소값이 동일한지 비교함
				// 0 1 2 3
				// G O L D
				System.out.println("GOLD-->" + strGold.hashCode()); // String@2193504

				// 0
				// G
				System.out.println("G-->" + strGold2.hashCode()); // String@71

				// new operator
				// 0 1 2 3
				// G O L D
				System.out.println("new GOLD-->" + new String("GOLD").hashCode()); // String@2193504

		}
}
