package homework5;

import java.util.Arrays;

public class ArrayUtil {
  public int[] fillRandomValues(int[] workingArray, int minBound, int maxBound, boolean isUniq) {
    for (int i = 0; i < workingArray.length; i++) {
      if (isUniq) {
        workingArray[i] =
                getNewUniqRandomValue(
                        Arrays.copyOf(workingArray, i + 1),
                        minBound,
                        maxBound);
      } else {
        workingArray[i] = (int) (Math.random() * (maxBound - minBound + 1)) + minBound;
      }
    }

    return workingArray;
  }

  private int getNewUniqRandomValue(int[] workingArray, int minBound, int maxBound) {
    int newValue;
    boolean isInArray;

    do {
      newValue = (int) (Math.random() * (maxBound - minBound + 1)) + minBound;
      isInArray = checkIsExistsNumberInArray(workingArray, newValue);
    } while (isInArray);

    return newValue;
  }

  public boolean checkIsExistsNumberInArray(int[] workingArray, int searchNumber) {
    Arrays.sort(workingArray);
    return (Arrays.binarySearch(workingArray, searchNumber) >= 0);
  }

  public int searchNotExistsNumber(int[] workingArray, int maxNumber) {
    int searchNumber = -1;

    Arrays.sort(workingArray);

    for (int i = 1; i <= maxNumber; i++) {
      if (Arrays.binarySearch(workingArray, i) < 0) {
        searchNumber = i;
        break;
      }
    }

    return searchNumber;
  }

  public int countPairEqualsNumber(int[] workingArray, int sumNumber) {
    int count = 0;

    for (int i = 0; i < workingArray.length - 1; i++) {
      for (int j = i + 1; j < workingArray.length; j++) {
        if ((workingArray[i] + workingArray[j]) == sumNumber) {
          System.out.printf("%d) A[%d] + A[%d] = %d + %d = %d \n", count + 1, i, j, workingArray[i], workingArray[j], sumNumber);
          count++;
        }
      }
    }
    return count;
  }
}
