package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.meta.generics.WebhookBot;

import java.util.List;

public class Q_botbot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage(update.getMessage().getChatId(), "helllo");
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {

    }

    @Override
    public String getBotUsername() {
        return "Q_botbot";
    }

    @Override
    public String getBotToken() {
        return "884096550:AAGhjdjdyny7bQTQSo5xsmaD8HsBlzulCEs";
    }
}
