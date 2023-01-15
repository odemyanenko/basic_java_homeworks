package homework4.arrays_while_loop;

import java.util.Arrays;

public class ArrayService {
  public boolean contains(int[] array, int numberToSearch) {
    boolean isContains = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == numberToSearch) {
        isContains = true;
        break;
      }
    }

    return isContains;
  }

  public int countOccurrences(int[] array, int numberToSearch) {
    int countOccurrences = 0;
    for (int i = 0; i < array.length; i++) {
      if (numberToSearch == array[i]) {
        countOccurrences++;
      }
    }

    return countOccurrences;
  }

  public boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
    boolean isReplace = false;
    for (int i = 0; i < array.length; i++) {
      if (numberToReplace == array[i]) {
        array[i] = newNumber;
        isReplace = true;
        break;
      }
    }

    return isReplace;
  }

  public int replaceAll(int[] array, int numberToReplace, int newNumber) {
    int countReplaces = 0;
    for (int i = 0; i < array.length; i++) {
      if (numberToReplace == array[i]) {
        array[i] = newNumber;
        countReplaces++;
      }
    }

    return countReplaces;
  }

  public void revert(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
  }
}
