package com.likelion.week6.day28.genericex;
// May.26 2023
// 제네릭 타입
public class Box<T> {
		private T item;

		public T getItem() {
				return item;
		}

		public void setItem(T item) {
				this.item = item;
		}
}
