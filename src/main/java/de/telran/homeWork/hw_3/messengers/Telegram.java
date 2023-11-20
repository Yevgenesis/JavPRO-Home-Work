package de.telran.homeWork.hw_3.messengers;

public class Telegram implements Messengers{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message was send via Telegram");

    }

    @Override
    public String getMessage() {
        return "You received a message from Telegram";
    }
}
