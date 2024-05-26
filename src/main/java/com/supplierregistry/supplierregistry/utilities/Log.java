package com.supplierregistry.supplierregistry.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
	private enum Level {
		DEBUG,
		INFO,
		ERROR,
	}

	public static void debug(String message) {
		log(Level.DEBUG, message);
	}

	public static void info(String message) {
		log(Level.INFO, message);
	}

	public static void error(String message) {
		log(Level.ERROR, message);
	}

	private static void log(Level level, String message) {
		String color = "";
		switch (level) {
			case DEBUG:
				color = "\033[0;36m"; // Cyan color
				break;
			case INFO:
				color = "\033[0;32m"; // Green color
				break;
			case ERROR:
				color = "\033[0;31m"; // Red color
				break;
		}

		System.out.printf("[%s] %s: %s%n", getFormattedDate(), colorize(color, level.toString()), message);
	}

	private static String getFormattedDate() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		return now.format(formatter);
	}

	private static String colorize(String color, String text) {
		String template = "%s %s %s";

		return String.format(template, color, text, "\033[0m");
	}
}
