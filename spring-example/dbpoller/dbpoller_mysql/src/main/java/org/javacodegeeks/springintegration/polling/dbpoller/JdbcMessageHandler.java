package org.javacodegeeks.springintegration.polling.dbpoller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class JdbcMessageHandler {

	public void handleJdbcMessage(List<Map<String, Object>> message) {
		for (Map<String, Object> resultMap: message) {
			System.out.println("Row");
			for (String column: resultMap.keySet()) {
				System.out.println("column: " + column + " value: " + resultMap.get(column));
			}
		}
	}
}
