package com.likelion.project2;

import java.time.LocalDateTime;

public class CrawlDate {
		// Set initial value[초기값 설정]
		private LocalDateTime lastCrawlDateTime;

		// Constructor add[생성자 추가]
		public CrawlDate(LocalDateTime lastCrawlDateTime) {
				this.lastCrawlDateTime = lastCrawlDateTime;
		}
}
