package com.likelion.week6.day28.collectionex.listex;

import java.util.ArrayList;
import java.util.List;

// May.26 2023
public class ListClass implements ListInterface {
		private List<String> names = new ArrayList<>();
		private String nameInput;
		private int ageInput;

		// 추가 메서드
		public void listAdd(String nameInput, int ageInput) {
				names.add(nameInput);
				names.add(String.valueOf(ageInput));
		}

		// 결과 메서드
		@Override
		public void listPrint() {
				System.out.println(names);;
		}
}
