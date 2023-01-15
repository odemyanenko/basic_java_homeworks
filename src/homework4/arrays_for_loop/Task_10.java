package homework4.arrays_for_loop;

/*
    Напишите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива любым целым числом,
        - выведите значение каждой ячейки на консоль.
*/
public class Task_10 {
  public static void main(String[] args) {
    int[] arrayNumbers = {23, 2, -23};

    for (int arrayNumber : arrayNumbers) {
      System.out.println(arrayNumber);
    }
  }
}
