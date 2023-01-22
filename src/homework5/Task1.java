package homework5;

import java.util.Arrays;

/*
1. Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N .
   Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент.
        Пример 1:
        Вход:
        N = 5
        А[] = {1,2,3,5}
        Ответ: 4

        Пример 2:
        Вход:
        N = 10
        А[] = {6,1,2,8,3,4,7,10,5}
        Ответ: 9
*/
public class Task1 {
  public static void main(String[] args) {
    UserInterface userInterface = new UserInterface();
    ArrayUtil arrayUtil = new ArrayUtil();

    int sizeArray = userInterface.intUserInput("Please, enter array size (>2): ", 3);

    int[] arrayBase = new int[sizeArray - 1];

    arrayBase = arrayUtil.fillRandomValues(arrayBase, 1, sizeArray, true);

    int searchNumber = arrayUtil.searchNotExistsNumber(arrayBase.clone(), sizeArray);

    System.out.println("A[] = " + Arrays.toString(arrayBase));
    System.out.println("Search Number: " + searchNumber);
  }
}
