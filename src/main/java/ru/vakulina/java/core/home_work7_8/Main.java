package ru.vakulina.java.core.home_work7_8;

import ru.vakulina.java.core.home_work7_8.entity.WeatherObject;
import ru.vakulina.java.core.home_work7_8.view.IUserInterface;
import ru.vakulina.java.core.home_work7_8.view.UserInterface;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + GlobalState.getInstance().DB_NAME);
        Statement statement = connection.createStatement();
        GlobalState.getInstance().setConnection(connection);
        IUserInterface userInterface = new UserInterface();
        userInterface.showUI();
    }

}
