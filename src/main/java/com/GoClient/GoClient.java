package com.GoClient;

import java.util.Scanner;

public class GoClient extends ServerCommunicator {
    Scanner scanner = new Scanner(System.in);

    @Override
    protected boolean askQuestion(String question) {
        write(question);
        sendMessage(read());
        return true;
    }

    @Override
    protected boolean askYesNo(String s) {
        write(s);
        sendMessage(read());
        return true;
    }

    @Override
    protected boolean askChoose(String s) {
        String[] choices = s.split("%");
        write(choices[0] + choices[choices.length - 1]);
        sendMessage(read());
        return true;
    }

    @Override
    protected boolean askValue(String s) {
        write(s);
        sendMessage(read());
        return true;
    }

    @Override
    protected boolean takeMove(String move) {
        write(move);
        sendMessage(read());
        return true;
    }

    @Override
    protected boolean displayMessage(String message) {
        write(message);
        return true;
    }

    @Override
    protected boolean displayBoard(String board) {
        write(board.replace("N", "+"));
        return true;
    }

    @Override
    protected boolean displayScore(String score) {
        write(score);
        return true;
    }

    @Override
    protected boolean displayText(String text) {
        write(text);
        return true;
    }

    @Override
    protected boolean displayError(String message) {
        write(message);
        return true;
    }

    private void write(String message) {
        System.out.println(message.replace("|", "\n"));
    }

    private String read() {
        return scanner.nextLine();
    }
}
