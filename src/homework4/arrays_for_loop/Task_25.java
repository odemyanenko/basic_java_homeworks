package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - запросите у пользователя с консоли длину массива
        - создайте массив указанной пользователем длины
        - заполните массив числами полученными от пользователя
        - распечатайте на консоль все элементы массива.
*/
public class Task_25 {
  public static void main(String[] args) {
    int arraySize = UserInterface.userArraySizeInput("Please enter array size: ");
    int[] ourWorkingArray = ArrayUtil.createArray(arraySize);

    ArrayUtil.fillArray(ourWorkingArray);
    ArrayUtil.printArrayToConsole(ourWorkingArray);
  }
}
