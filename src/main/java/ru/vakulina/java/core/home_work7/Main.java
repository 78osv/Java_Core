package ru.vakulina.java.core.home_work7;

import ru.vakulina.java.core.home_work7.view.IUserInterface;
import ru.vakulina.java.core.home_work7.view.UserInterface;

public class Main {

    public static void main(String[] args) {
        IUserInterface userInterface = new UserInterface();
        userInterface.showUI();
    }
}
