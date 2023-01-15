package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива числом, запрошенным у пользователя,
        - выведите значение каждой ячейки на консоль.
        */
public class Task_11 {
  public static void main(String[] args) {
    int[] arrayNumbers = new int[3];

    ArrayUtil.fillArray(arrayNumbers);
    ArrayUtil.printArrayToConsole(arrayNumbers);
  }
}
