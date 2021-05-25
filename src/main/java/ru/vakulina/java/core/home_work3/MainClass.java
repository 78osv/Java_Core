package ru.vakulina.java.core.home_work3;

import java.util.Arrays;

public class MainClass<system> {
    public static void main(String[] args) {

    /*
    1.Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    */

        String[] arr = {"a", "b", "c", "d"};
        System.out.println("Задание 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

    /*
    2. Коробки с фруктами.
    */

    System.out.println("Задание 2");
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();

        Orange or1 = new Orange();
        Orange or2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(ap1, ap2, ap3);
        Box<Orange> box2 = new Box<Orange>(or1, or2);
        System.out.println("Вес коробки с яблоками:" + box1.getWeight());
        System.out.println("Вес коробки с апельсинами:" + box2.getWeight());

        System.out.println("Результат сравнения коробок:" + box1.compare(box2));

        // перекидываем апельсины со второй коробки в третью

        Box<Orange> box3 = new Box<Orange>();
        box2.move(box3);
        System.out.println("Новый вес коробки с апельсинами:" + box2.getWeight());
        System.out.println("Результат сравнения коробок:" + box1.compare(box2));
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


}
