package homework2;

import java.util.Scanner;

public class Task3_Words {
  public static void main(String[] args) {
//    введите 2 слова, используйте сканер, состоящий из четного количества букв (проверьте количество букв в слове).
//    Получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.

    Scanner scanner = new Scanner(System.in);

    String textWordOne;
    String textWordTwo;

    System.out.println("Please, enter 1 Word: ");
    textWordOne = scanner.nextLine();

    System.out.println("Please, enter 2 Word: ");
    textWordTwo = scanner.nextLine();

    if ((textWordOne.length() > 0) && (textWordTwo.length() > 0) && isEven(textWordOne) && isEven(textWordTwo)){
      String textResult;
      textResult = textWordOne.substring(0, textWordOne.length()/2) + textWordTwo.substring(textWordTwo.length()/2);
      System.out.println("Result: " + textResult);
    }
    else {
      System.out.println("One from words is not even!");
    }
  }
  public static boolean isEven(String textWord){
    return (textWord.length() % 2 == 0);
  }
}
