package com.stats.StatisticProject;

import com.stats.StatisticProject.tg.TelegramBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class StatisticProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticProjectApplication.class, args);


		TelegramBot telegramBot = new TelegramBot();
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(telegramBot);
		} catch (TelegramApiException e) {
			e.printStackTrace();
			System.out.println("Error with telegram bot");
		}
	}
}
