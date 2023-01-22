package homework5;

import java.util.Arrays;

/*
Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.
        Пример 1:
        Вход:
        N = 4, K = 6
        arr[] = {1, 5, 7, 1}
        Вывод: 2 пары чисел
        Объяснение:
        arr[0] + arr[1] = 1 + 5 = 6
        arr[1] + arr[3] = 5 + 1 = 6.

        Пример 2:
        Вход:
        N = 4, К = 2
        arr[] = {1, 1, 1, 1}
        Выход: 6 пар чисел
*/
public class Task2 {
  public static void main(String[] args) {
    UserInterface userInterface = new UserInterface();
    ArrayUtil arrayUtil = new ArrayUtil();

    int sizeArray = userInterface.intUserInput("Please, enter array size (>2): ", 3);
    int[] arrayBase = new int[sizeArray];

    int sumPairOfNumbers = userInterface.intUserInput("Please, enter number (sum pair of numbers): ");

    arrayBase = arrayUtil.fillRandomValues(arrayBase, 2, sizeArray, false);
    System.out.println("A[] = " + Arrays.toString(arrayBase));
    System.out.println("------------------------------------");
    int countPair = arrayUtil.countPairEqualsNumber(arrayBase, sumPairOfNumbers);
    System.out.println("------------------------------------");
    System.out.println("Count pair with sum values (" + sumPairOfNumbers+ ") = " + countPair);
  }
}
