package ru.vakulina.java.core.home_work2new;

public class MainClass {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "1", "1","1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"},
        };
        try {
            int sum = testArray(arr);
            System.out.println("Sum = "+ sum);
        } catch (MyArraySizeException e) {
            System.out.println("Wrong size");
        } catch (MyArrayDataException e1) {
            System.out.printf("Incorrect data in [%d, %d]", e1.i, e1.j);
        }
    }


    public static int testArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("wrong size");
        }
        for (int i=0; i<4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("wrong size");
            }
        }

        int sum = 0;

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
