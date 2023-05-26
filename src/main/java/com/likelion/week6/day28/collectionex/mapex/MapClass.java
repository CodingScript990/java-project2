package com.likelion.week6.day28.collectionex.mapex;

import java.util.HashMap;
import java.util.Map;

// May.26 2023
public class MapClass implements MapInterface {
		private Map<String, Integer> scores = new HashMap<>();
		private String strInput;
		private int intInput;


		// 추가 메서드
		void mapAdd(String strInput, int intInput) {
				scores.put(strInput, intInput);
		}

		// 결과 메서드
		@Override
		public void mapPrint() {
				System.out.println(scores);
		}
}
