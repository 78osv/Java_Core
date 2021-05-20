package ru.vakulina.java.core.home_work2;

public class MyArrayDataException extends NumberFormatException {
    private int a, b;

    public String getElement() {
        return "[" + a + "][" + b + "]";
    }

    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyArrayDataException(String s, int a, int b) {
        super(s);
        this.a = a;
        this.b = b;
    }
}
