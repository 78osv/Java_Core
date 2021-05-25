package ru.vakulina.java.core.home_work3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruits() {
        return new ArrayList<T>(fruits);
    }

    public void clear() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0) return 0;
        float weight = 0;
        for (T item: fruits) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void move(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }
}
