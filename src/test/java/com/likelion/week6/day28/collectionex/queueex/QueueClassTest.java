package com.likelion.week6.day28.collectionex.queueex;
// May.26 2023
class QueueClassTest {
		public static void main(String[] args) {

				QueueClass queueClass = new QueueClass();

				queueClass.queueAdd("A");
				queueClass.queueAdd("B");
				queueClass.queueAdd("C");

				queueClass.queuePrint();

				queueClass.queuePoll();

				queueClass.queuePeek();

				queueClass.queueSize();

				queueClass.queuePrint();
		}
}