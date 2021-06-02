package ru.vakulina.java.core.home_work5;

public class AppData {

    private  String Test1;
    private  String Test2;
    private  String Test3;

    public AppData() {
    }

     public AppData(String test1, String test2, String test3) {
        Test1 = test1;
        Test2 = test2;
        Test3 = test3;
    }

    public String getTest1() {
        return Test1;
    }

    public void setTest1(String test1) {
        Test1 = test1;
    }

    public String getTest2() {
        return Test2;
    }

    public void setTest2(String test2) {
        Test2 = test2;
    }

    public String getTest3() {
        return Test3;
    }

    public void setTest3(String test3) {
        Test3 = test3;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "Test1='" + Test1 + '\'' +
                ", Test2='" + Test2 + '\'' +
                ", Test3='" + Test3 + '\'' +
                '}';
    }
}
