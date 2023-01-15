package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - запросите у пользователя с консоли длину массива
        - создайте массив указанной пользователем длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива.
*/
public class Task_26 {
  public static void main(String[] args) {
    int arraySize = UserInterface.userArraySizeInput("Please enter array size: ");

    int[] ourWorkingArray = ArrayUtil.createArray(arraySize);
    ArrayUtil.fillArray(ourWorkingArray, 100);
    ArrayUtil.printArrayToConsole(ourWorkingArray);
  }
}
