package homework4.arrays_for_loop;

import java.util.Arrays;

/*
Напишите программу, в которой:
        - создайте массив произвольной длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива
        - найдите все нечётные числа в массиве и выведети их на консоль.
*/
public class Task_30 {
  public static void main(String[] args) {

    int arraySize = UserInterface.userArraySizeInput("Please enter array size: ");

    int[] ourWorkingArray = ArrayUtil.createArray(arraySize);
    ArrayUtil.fillArray(ourWorkingArray, 100);
    ArrayUtil.printArrayToConsole(ourWorkingArray);

    int[] arrayOdd  = ArrayUtil.findOddElements(ourWorkingArray);
    System.out.println("Odd Numbers in Array: ");
    ArrayUtil.printArrayToConsole(arrayOdd);
  }
}
