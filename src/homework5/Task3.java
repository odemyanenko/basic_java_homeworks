package homework5;

/*
Дано два числа, например 3 и 56, значение которых хранятся в переменных.
        a)Необходимо составить следующие текстовые строки:
        3 + 56 = 59
        3 – 56 = -53
        3 * 56 = 168.
        Используйте метод StringBuilder.append().
        b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
*/
public class Task3 {
  public static void main(String[] args) {
    UserInterface userInterface = new UserInterface();

    int numOne = userInterface.intUserInput("Please, enter 1-Number...");
    int numTwo = userInterface.intUserInput("Please, enter 2-Number...");


    StringBuilder stringAdd = printAddOperation(numOne, numTwo);
    StringBuilder stringSub = printSubOperation(numOne, numTwo);
    StringBuilder stringMult = printMultOperation(numOne, numTwo);

    System.out.println("a)");
    System.out.println(stringAdd.toString());
    System.out.println(stringSub.toString());
    System.out.println(stringMult.toString());

    int indexSign = stringAdd.indexOf("=");
    String stringEqual = "equal";

    System.out.println("b)");
    System.out.println(modifiedStringVariantB(stringAdd, indexSign, stringEqual).toString());
    System.out.println(modifiedStringVariantB(stringSub, indexSign, stringEqual).toString());
    System.out.println(modifiedStringVariantB(stringMult, indexSign, stringEqual).toString());

    System.out.println("c)");
    stringAdd = printAddOperation(numOne, numTwo);
    stringSub = printSubOperation(numOne, numTwo);
    stringMult = printMultOperation(numOne, numTwo);
    System.out.println(modifiedStringVariantC(stringAdd, indexSign, stringEqual).toString());
    System.out.println(modifiedStringVariantC(stringSub, indexSign, stringEqual).toString());
    System.out.println(modifiedStringVariantC(stringMult, indexSign, stringEqual).toString());
  }

  private static StringBuilder printMultOperation(int number1, int number2) {
    return new StringBuilder().append(number1).append(" * ").append(number2).append(" = ").append(number1 * number2);
  }

  private static StringBuilder printSubOperation(int number1, int number2) {
    return new StringBuilder().append(number1).append(" - ").append(number2).append(" = ").append(number1 - number2);
  }

  public static StringBuilder printAddOperation(int number1, int number2) {
    return new StringBuilder().append(number1).append(" + ").append(number2).append(" = ").append(number1 + number2);
  }

  private static StringBuilder modifiedStringVariantB(StringBuilder workingString, int indexStart, String insertString) {
    return workingString.insert(indexStart, insertString).deleteCharAt(indexStart + insertString.length());
  }

  private static StringBuilder modifiedStringVariantC(StringBuilder workingString, int indexStart, String insertString) {
    return workingString.replace(indexStart, indexStart + 1, insertString);
  }
}

