package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - создайте массив произвольной длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива
        - найдите наименьшее число в массиве и выведети его на консоль.
*/
public class Task_28 {
  public static void main(String[] args) {
    int arraySize = UserInterface.userArraySizeInput("Please enter array size: ");

    int[] ourWorkingArray = ArrayUtil.createArray(arraySize);
    ArrayUtil.fillArray(ourWorkingArray, 100);
    ArrayUtil.printArrayToConsole(ourWorkingArray);

    int minElement = ArrayUtil.findMinElement(ourWorkingArray);
    System.out.println("Min Element = " + minElement);
  }
}
