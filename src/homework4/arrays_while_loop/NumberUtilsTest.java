package homework4.arrays_while_loop;
/*
Напишите тесты для проверки метода isEven(int number).
        Упростите работу метода, код внутри может быть написан в одну строку.
class NumberUtils {
  public boolean isEven(int number) {
    return (number % 2 == 0);
  }
}
*/

public class NumberUtilsTest {
  public static void main(String[] args) {
    NumberUtilsTest test = new NumberUtilsTest();
    test.shouldCheckEvenNumber();
  }

  private void shouldCheckEvenNumber() {
    NumberUtils numberUtils = new NumberUtils();
    if (numberUtils.isEven(2)) {
      System.out.println("Check Even Number is Correct!");
    } else {
      System.out.println("Check Even Number is Wrong!");
    }
  }
}
