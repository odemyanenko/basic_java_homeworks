package homework4.arrays_while_loop;

import java.util.Arrays;

public class ArrayServiceTest {
  public static void main(String[] args) {
    ArrayServiceTest test = new ArrayServiceTest();

    test.givenNumberToSearch_whenExecuteContains_thenReturnTrue();
    test.givenNumberToSearch_whenExecuteContains_thenReturnFalse();

    test.givenNumberToSearch_whenExecuteCountOccurrences_thenReturnTrue();
    test.givenNumberToSearch_whenExecuteCountOccurrences_thenReturnFalse();

    test.givenNumberToReplace_whenReplaceFirst_thenReturnTrue();
    test.givenNumberToReplace_whenReplaceFirst_thenReturnFalse();

    test.givenNumberToReplace_whenReplaceAll_thenReturnTrue();
    test.givenNumberToReplace_whenReplaceAll_thenReturnFalse();

    test.givenArray_whenRevert_thenReturnRevertArray();
  }
  public int[] data(){
    return new int[]{12, -2, 45, 4, 67, 45, 12, 1};
  }

  public void givenNumberToSearch_whenExecuteContains_thenReturnTrue() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    boolean actualContains = arrayService.contains(arrayData, 45);
    boolean expectedContains = true;

    checkTestResult(actualContains == expectedContains, "contains number in array");
  }

  public void givenNumberToSearch_whenExecuteContains_thenReturnFalse() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    boolean actualContains = arrayService.contains(arrayData, 0);
    boolean expectedContains = false;

    checkTestResult(actualContains == expectedContains, "not contains number in array");
  }

  private void checkTestResult(boolean condition, String testName) {
    if (condition) {
      System.out.println(testName + " = OK!");
    } else {
      System.out.println(testName + " = FAIL!");
    }
  }

  public void givenNumberToSearch_whenExecuteCountOccurrences_thenReturnTrue() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    int actualCountOccurrences = arrayService.countOccurrences(arrayData, 45);
    int expectedCountOccurrences = 2;

    checkTestResult(actualCountOccurrences == expectedCountOccurrences, "count occurrences exist number in array");
  }

  public void givenNumberToSearch_whenExecuteCountOccurrences_thenReturnFalse() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    int actualCountOccurrences = arrayService.countOccurrences(arrayData, 0);
    int expectedCountOccurrences = 0;

    checkTestResult(actualCountOccurrences == expectedCountOccurrences, "count occurrences not exist number in array");
  }

  public void givenNumberToReplace_whenReplaceFirst_thenReturnTrue() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    boolean actualReplace = arrayService.replaceFirst(arrayData, -2, -3);
    boolean expectedReplace = true;

    checkTestResult(actualReplace == expectedReplace, "replace first exist number in array");
  }

  public void givenNumberToReplace_whenReplaceFirst_thenReturnFalse() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    boolean actualReplace = arrayService.replaceFirst(arrayData, -10, -3);
    boolean expectedReplace = false;

    checkTestResult(actualReplace == expectedReplace, "replace first not exist number in array");
  }

  public void givenNumberToReplace_whenReplaceAll_thenReturnTrue() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    int actualReplace = arrayService.replaceAll(arrayData, 12, 13);
    int expectedReplace = 2;

    checkTestResult(actualReplace == expectedReplace, "replace all exist number in array");
  }

  public void givenNumberToReplace_whenReplaceAll_thenReturnFalse() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();

    int actualReplace = arrayService.replaceAll(arrayData, 0, 13);
    int expectedReplace = 0;

    checkTestResult(actualReplace == expectedReplace, "replace all not exist number in array");
  }

  public void givenArray_whenRevert_thenReturnRevertArray() {
    ArrayService arrayService = new ArrayService();

    int[] arrayData = data();
    int[] arrayRevert = new int[]{1, 12, 45, 67, 4, 45, -2, 12};

    arrayService.revert(arrayData);

    boolean actualRevert = Arrays.equals(arrayData, arrayRevert);
    boolean expectedRevert = true;

    checkTestResult(actualRevert == expectedRevert, "revert numbers in array");
  }

}
