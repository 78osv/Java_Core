package ru.vakulina.java.core.home_work4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    Map<String, Set<String>> phonebook;
    Phonebook () {
        this.phonebook = new HashMap<>();
    }
    void add(String surname, String telephone) {
        Set<String> list = phonebook.getOrDefault(surname, new HashSet<>());
        list.add(telephone);
        phonebook.put(surname, list);
    }
    void get(String surname) {
        System.out.println(surname + ": " + phonebook.getOrDefault(surname, new HashSet<>()));
    }

}
