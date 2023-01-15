package homework4.arrays_for_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {
  public static int[] createArray(int arrayLength) {
    return new int[arrayLength];
  }

  public static void fillArray(int[] workingArray, int randomRange) {
    fillArrayWithRandomNumbers(workingArray, randomRange);
  }

  public static void fillArray(int[] workingArray) {
    fillArrayByUserInput(workingArray);
  }

  private static void fillArrayByUserInput(int[] workingArray) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, fill array data...");
    for (int i = 0; i < workingArray.length; i++) {
      System.out.println((i + 1) + " element :");
      workingArray[i] = scanner.nextInt();
    }
  }

  private static void fillArrayWithRandomNumbers(int[] workingArray, int randomRange) {
    for (int i = 0; i < workingArray.length; i++) {
      workingArray[i] = (int) (Math.random() * randomRange) + 1;
    }
  }
  public static int findSumElements(int[] workingArray) {
    int sumElements = 0;
    for (int i = 0; i < workingArray.length; i++) {
      sumElements += workingArray[i];
    }
    return sumElements;
  }

  public static int findAverageElements(int[] workingArray) {
    return findSumElements(workingArray) / workingArray.length;
  }

  public static int findMaxNumber(int[] workingArray) {
    int maxElement = workingArray[0];
    for (int i = 0; i < workingArray.length; i++) {
      if (workingArray[i] > maxElement) {
        maxElement = workingArray[i];
      }
    }
    return maxElement;
  }

  public static int findMinElement(int[] workingArray) {
    int minElement = workingArray[0];
    for (int i = 0; i < workingArray.length; i++) {
      if (workingArray[i] < minElement) {
        minElement = workingArray[i];
      }
    }
    return minElement;
  }

  public static int[] findEvenElements(int[] workingArray) {
    int[] evenArray = new int[workingArray.length / 2];
    int count = 0;

    for (int i = 0; i < workingArray.length; i++) {
      if (i % 2 == 1) {
        evenArray[count] = workingArray[i];
        count++;
      }
    }
    return evenArray;
  }

  public static int[] findOddElements(int[] workingArray) {
    int sizeEventArray = (workingArray.length % 2 == 0) ?
            workingArray.length / 2 :
            workingArray.length / 2 + 1;
    int[] evenArray = new int[sizeEventArray];
    int count = 0;

    for (int i = 0; i < workingArray.length; i++) {
      if (i % 2 == 0) {
        evenArray[count] = workingArray[i];
        count++;
      }
    }
    return evenArray;
  }

  public static void printArrayToConsole(int[] workingArray){
    System.out.println(Arrays.toString(workingArray));
  }
}
