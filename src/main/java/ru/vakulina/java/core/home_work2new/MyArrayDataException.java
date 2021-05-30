package ru.vakulina.java.core.home_work2new;

public class MyArrayDataException extends Exception{
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        super("Incorrect data in i = " +i+ "j= " +j);
        this.i = i;
        this.j = j;

    }
}
