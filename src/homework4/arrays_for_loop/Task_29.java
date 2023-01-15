package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - создайте массив произвольной длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива
        - найдите все чётные числа в массиве и выведети их на консоль.
*/
public class Task_29 {
  public static void main(String[] args) {
    int arraySize = UserInterface.userArraySizeInput("Please enter array size: ");

    int[] ourWorkingArray = ArrayUtil.createArray(arraySize);
    ArrayUtil.fillArray(ourWorkingArray, 100);
    ArrayUtil.printArrayToConsole(ourWorkingArray);

    int[] arrayEven  = ArrayUtil.findEvenElements(ourWorkingArray);
    System.out.println("Even Numbers in Array: ");
    ArrayUtil.printArrayToConsole(arrayEven);

  }
}
