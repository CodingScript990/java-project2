package com.likelion.week6.day28.collectionex.setex;

import java.util.HashSet;
import java.util.Set;
// May.26 2023
public class SetClass implements SetInterface {
		private Set<String> fruits = new HashSet<>();
		private String fruitNames;
		private int fruitPrice;

		// 추가 메서드
		public void setAdd(String fruitNames, int fruitPrice) {
				fruits.add(fruitNames);
				fruits.add(String.valueOf(fruitPrice));
		}

		// 출력 메서드
		@Override
		public void setPrint() {
				System.out.println(fruits);
		}
}
