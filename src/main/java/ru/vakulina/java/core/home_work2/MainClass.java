package ru.vakulina.java.core.home_work2;
/*
1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4.
   При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
   Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа),
   надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException
   и вывести результат расчета.
 */

import ru.vakulina.java.core.home_work2.MyArrayDataException;
import ru.vakulina.java.core.home_work2.MyArraySizeException;

public class MainClass {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"},
        };

        try {
            System.out.println("Сумма всех элементов массива - " + getSum(arr, 4));
        } catch (MyArraySizeException e) {
            System.out.println("Невозможно вычислить сумму элементов массива. Массив не соответствует заданному размеру.");
        } catch (MyArrayDataException e) {
            System.out.println("Невозможно вычислить сумму элементов массива. В ячейке " + e.getElement() + " неверные данные");
        }
    }

    public static int getSum(String[][] arr, int arraySize) throws MyArrayDataException, MyArraySizeException {
        int result = 0;

        if (arr.length != arraySize) {
            throw new MyArraySizeException("Массив не соответствует заданному размеру.", arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arraySize) {
                throw new MyArraySizeException("Массив не соответствует заданному размеру.", arr[i].length);
            }

            for (int j = 0; j < arr[i].length; ++j) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент невозможно привести к цифровому значению", i, j);
                }
            }
        }

        return result;
    }
}
