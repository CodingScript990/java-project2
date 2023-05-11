package com.likelion.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
		public static void main(String[] args) {
				// 제네릭!!! => 반(무슨 타입??) 참조변수는?(학생)
				// 제네릭 => 컬렉션을 꼭 명시해줌
				// List<타입>
				// 선언 할 때 컬렉션에 타입을 지정 해줌
				// [주의] 제네릭을 안쓰면 반복해서 사용할 때 타입을 예측할 수 없음으로 인한 불편함이 생기고 split() 사용이 불가함
				List<String> strList = new ArrayList<>();

				// 문자형
				strList.add("Hi");
				strList.add("bye");
				strList.add("see u");
				strList.add("1");

				// for each
				for (var str : strList) {
						System.out.println(str);
				}

				// 정수형
				List<Integer> intList = new ArrayList<>();

				intList.add(1);
				intList.add(10);
				intList.add(100);

				// for each
				for (var it : intList) {
						System.out.println(it);
				}
		}
}
