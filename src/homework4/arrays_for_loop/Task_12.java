package homework4.arrays_for_loop;
/*
Напишите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива случайным числом,
        - выведите значение каждой ячейки на консоль.
*/
public class Task_12 {
  public static void main(String[] args) {
    int[] arrayNumbers = new int[3];

    ArrayUtil.fillArray(arrayNumbers, 100);

    for (int arrayNumber : arrayNumbers) {
      System.out.println(arrayNumber);
    }
  }
}
