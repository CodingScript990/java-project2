package com.likelion.week6.day28.genericex;

import java.util.ArrayList;
import java.util.List;
// May.26 2023
class BoxTest {
		public static void main(String[] args) {
				// 타입별 사용[Integer]
				Box<Integer> box = new Box<>();

				box.setItem(10);

				// 타이별 사용[String]
				Box<String> strBox = new Box<>();

				strBox.setItem("10");

				// String type
				List<String> strList = new ArrayList<>();

				/*
				strList.add("1");
				strList.add("2");

				String firstStringItem = this.getFirstItem(strList);

				System.out.println(firstStringItem);
				 */

				// Integer type
				List<Integer> intList = new ArrayList<>();

				/*
				strList.add(1);
				strList.add(2);

				int firstIntItem = this.getFirstItem(strList);

				System.out.println(firstIntItem);
				 */
		}
		public <T> T getFirstItem(List<T> list) {
				if (list.isEmpty()) {
						return null;
				}
				return list.get(0); // 제네릭 타입
		}
}