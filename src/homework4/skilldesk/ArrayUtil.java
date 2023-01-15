package homework4.skilldesk;

public class ArrayUtil {
  public static int[] createArray(int arrayLength) {
    return new int[arrayLength];
  }
  public static void fillArrayWithRandomNumbers(int[] workingArray, int FromRange, int ToRange) {
    for (int i = 0; i < workingArray.length; i++) {
      workingArray[i] = (int) (Math.random() * (ToRange - FromRange + 1)) + FromRange;
    }
  }

  public static void printArrayInRow(int[] workingArray){
    for (int i = 0; i < workingArray.length; i++) {
      System.out.printf("%02d ", workingArray[i]);
    }
    System.out.println();
  }

  public static void replaceOddToZero(int[] workingArray){
    for (int i = 0; i < workingArray.length; i++) {
      if (i % 2 == 0){
        workingArray[i] = 0;
      }
    }
  }

  public static boolean checkIncreasingArray(int[] ourWorkingArray) {
    boolean isIncreasing = true;
    int minNumber = ourWorkingArray[0];

    for (int i = 0; i < ourWorkingArray.length; i++) {
      if (minNumber > ourWorkingArray[i]){
        isIncreasing = false;
        break;
      }
      else {
        minNumber = ourWorkingArray[i];
      }
    }

    return isIncreasing;
  }
}
