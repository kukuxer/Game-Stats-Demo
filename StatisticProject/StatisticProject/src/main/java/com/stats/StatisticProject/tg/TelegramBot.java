package com.stats.StatisticProject.tg;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    public Long adminChatId = -4140335477L;

    @Override
    public String getBotUsername() {
        return "DemoUserAssistant_bot";
    }

    @Override
    public String getBotToken() {
        return "7179483208:AAFQPGTZ0OXW-uUx9oT66NpoeAXcumbMw80";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            if (update.getMessage().getChatId().equals(adminChatId)) { //check if the message is from the admin chat

                //Getting user's id from message admin is replying
                String repliedMessageText = update.getMessage().getReplyToMessage().getText();
                String userId = extractUserIdFromMessage(repliedMessageText);

                //Sending response to the user
                processAdminMessage(update, userId);
            } else { //if message is from the user's chat
                //Sending a question to the admins' chat
                forwardToAdminGroup(update);
            }
        }
    }

    private String extractUserIdFromMessage(String message){
        Pattern pattern = Pattern.compile("\\d+$");
        Matcher matcher = pattern.matcher(message);

        if (matcher.find()) {
            return matcher.group();
        }

        return null;
    }

    private void processAdminMessage(Update update, String userId) {

        SendMessage response = new SendMessage();
        response.setChatId(userId);
        response.setText("Admin response: " + update.getMessage().getText());

        try {
            execute(response);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void forwardToAdminGroup(Update update) {

        SendMessage message = new SendMessage();
        message.setChatId(adminChatId.toString());
        message.setText("New user question: " + update.getMessage().getText() + ". With User id: " + update.getMessage().getFrom().getId());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
