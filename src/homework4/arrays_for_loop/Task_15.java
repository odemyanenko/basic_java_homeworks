package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива случайным числом,
        - выведите значение каждой ячейки на консоль,
        - увеличьте значение каждой ячейки на 2,
        - выведите значение каждой ячейки на консоль.
*/
public class Task_15 {
  public static void main(String[] args) {
    int[] arrayNumbers = new int[3];

    ArrayUtil.fillArray(arrayNumbers, 100);
    ArrayUtil.printArrayToConsole(arrayNumbers);

    for (int i = 0; i < arrayNumbers.length; i++) {
      arrayNumbers[i] +=2;
    }
    ArrayUtil.printArrayToConsole(arrayNumbers);
  }
}
