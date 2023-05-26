package com.likelion.week6.day28.collectionex.queueex;

import java.util.LinkedList;
import java.util.Queue;
// May.26 2023
public class QueueClass implements QueueInterface {

		private Queue<String> queue = new LinkedList<>();
		private String queueInput;

		// 추가 메서드
		public void queueAdd(String queueInput) {
				queue.offer(queueInput);
		}

		// poll 메서드
		public void queuePoll() {
				System.out.printf("Queue Poll : %s\n", queue.poll());
		}

		// peek 메서드
		public void queuePeek() {
				System.out.printf("Queue Peek : %s\n", queue.peek());
		}

		// size 메서드
		public void queueSize() {
				System.out.printf("Queue Size : %s\n", queue.size());
		}

		// 출력 메서드
		@Override
		public void queuePrint() {
				System.out.printf("Queue Result : %s\n", queue);
		}
}
