package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива случайным числом,
        - посчитайте среднее значение и выведите его на консоль.
*/
public class Task_14 {
  public static void main(String[] args) {
    int[] arrayNumbers = new int[3];

    ArrayUtil.fillArray(arrayNumbers, 100);
    ArrayUtil.printArrayToConsole(arrayNumbers);

    double averageElements = ArrayUtil.findAverageElements(arrayNumbers);
    System.out.println("Average = " + averageElements);
  }
}
