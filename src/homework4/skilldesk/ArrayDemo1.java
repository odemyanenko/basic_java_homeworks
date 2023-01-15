package homework4.skilldesk;

/* 1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
         Выведите массив на экран в строку
         Замените каждый элемент с нечётным индексом на ноль
         Снова выведете массив на экран на отдельной строке*/
public class ArrayDemo1 {
  public static void main(String[] args) {
    int arraySize = UserInterface.userArraySizeInput("Please enter array size: ");
    int[] ourWorkingArray = ArrayUtil.createArray(arraySize);

    ArrayUtil.fillArrayWithRandomNumbers(ourWorkingArray, 1, 50);
    ArrayUtil.printArrayInRow(ourWorkingArray);
    ArrayUtil.replaceOddToZero(ourWorkingArray);
    ArrayUtil.printArrayInRow(ourWorkingArray);
  }
}
