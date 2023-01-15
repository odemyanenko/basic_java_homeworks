package homework4.arrays_for_loop;
/*
Создайте класс ArrayUtilTest.
        В этом классе напишите автоматический тест
        для метода int[] createArray(int arrayLength)
        из предыдущего задания.
class ArrayUtilTest {
  public static void main(String[] args) {
    ArrayUtilTest test = new ArrayUtilTest();
    test.shouldCreateArray();
  }
  public void shouldCreateArray() {
    // Напишите реализацию !!!
    // Проверьте, что метод создаёт массив указанной длины
  }
}
*/
class ArrayUtilTest {
  public static void main(String[] args) {
    ArrayUtilTest test = new ArrayUtilTest();
    test.shouldCreateArray();
    test.shouldFindMaxNumber();
    test.shouldFindMinNumber();
  }
  public void shouldCreateArray() {
    int[] arrayBase = new int[5];
    int[] arrayCreated = ArrayUtil.createArray(5);

    if (arrayBase.length == arrayCreated.length) {
      System.out.println("Created Array is Correct!");
    }
    else {
      System.out.printf("Created Array is Wrong (%d) (correct length %d)!", arrayCreated.length, arrayBase.length);
    }
  }

  public void shouldFindMaxNumber() {
    int[] arrayBase = {3, 0, -1};
    int maxNumberBase = 3;
    int maxNumberCalculated = ArrayUtil.findMaxNumber(arrayBase);

    if (maxNumberBase == maxNumberCalculated) {
      System.out.println("Found Max Element is Correct!");
    }
    else {
      System.out.printf("Found Max Element is Wrong (%d) (correct: %d)!", maxNumberCalculated, maxNumberBase);
    }
  }

  public void shouldFindMinNumber() {
    int[] arrayBase = {3, 0, -1};
    int minNumberBase = -1;
    int minNumberCalculated = ArrayUtil.findMinElement(arrayBase);

    if (minNumberBase == minNumberCalculated) {
      System.out.println("Found Min Element is Correct!");
    }
    else {
      System.out.printf("Found Min Element is Wrong (%d) (correct: %d)!", minNumberCalculated, minNumberBase);
    }
  }
}