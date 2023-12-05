package com.example.Selenium.Package02;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ControlText_SloveCaptcha {
    private String text;

    private Boolean checkPoint = false;

    public ControlText_SloveCaptcha(Boolean checkPoint, String text) {
        this.checkPoint = checkPoint;
        this.text = text;
    }


    public boolean controlText() {
        if (text == null || text.isEmpty() || text.length() <= 3) {
            System.out.println("control text flase");
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                System.out.println("control text flase");
                return false;
            }
        }
        System.out.println("control text true" + checkPoint);
        return true;
    }
}

class test {
    public static void main(String[] args) {
        isValidInput("1234");
    }

    public static boolean isValidInput(String input) {
        if (input == null || input.isEmpty() || input.length() <= 3) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}