package ru.vakulina.java.core.home_work5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<AppData> heading = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("homework.csv"))) {

            String line = null;
            in.readLine();
            while ((line = in.readLine()) != null){
                String[] tokens = line.split(";");
                AppData appData = new AppData(tokens[0], tokens[1],tokens[2]);
                heading.add(appData);
            };

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (AppData appData: heading) {
            System.out.println(appData);
        }
    }
}
