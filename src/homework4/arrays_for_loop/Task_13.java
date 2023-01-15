package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Написашите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива случайным числом,
        - посчитайте сумму всех ячеек и распечатайте ее на консоль.
*/
public class Task_13 {
  public static void main(String[] args) {
    int[] arrayNumbers = new int[3];

    ArrayUtil.fillArray(arrayNumbers, 100);
    ArrayUtil.printArrayToConsole(arrayNumbers);

    int sumElements = ArrayUtil.findSumElements(arrayNumbers);
    System.out.println("Sum Elements = " + sumElements);
  }
}
