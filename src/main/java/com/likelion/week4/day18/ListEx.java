package com.likelion.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
		public static void main(String[] args) {

				// List 선언
				List l1 = new ArrayList<>(); // ArrayList 인스턴스화

				// li list 타입에 있는 add 메서드를 호출하여 값을 넣어줌
				l1.add("Hello"); // list => Hello[0]
				l1.add(1); // list => 1[1]

				// output
				// get : 각 인덱스의 값을 보여주는 것
				System.out.println(l1.get(0)); // Hello[0]
				System.out.println(l1.get(1)); // 1[1]

				// size : list 의 값이 몇개나 있는가? 즉 list 범위
				System.out.println(l1.size()); // Hello 1 => 2개

				// isEmpty : 값이 있냐 없냐 boolean type
				System.out.println(l1.isEmpty()); // 값이 있기에 false => Hello 1

				// remove : list 값을 제거
				//l1.remove(0); // Hello[0] 1[1]
				//l1.remove(0); // 1[0]

				// isEmpty : 값이 있냐 없냐 boolean type
				System.out.println(l1.isEmpty()); // 값이 없기에 true => ""

				// 구분선
				System.out.println("---------");

				for (var item : l1) { // for each 를 많이 사용함[이터레이터]
						System.out.println(item);
				}
		}
}
