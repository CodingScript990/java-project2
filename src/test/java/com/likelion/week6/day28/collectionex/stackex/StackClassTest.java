package com.likelion.week6.day28.collectionex.stackex;
// May.26 2023
class StackClassTest {
		public static void main(String[] args) {

				StackClass stackClass = new StackClass();

				stackClass.stackAdd("A");
				stackClass.stackAdd("B");
				stackClass.stackAdd("C");

				stackClass.stackPrint();

				stackClass.stackPop();

				stackClass.stackPush("A");

				stackClass.stackPeek();

				stackClass.stackEmpty();

				stackClass.stackPrint();
		}
}