package homework2;

public class Task2 {
// 1 Создайте строку через new - I study Basic Java!
// 2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
// 3 Распечатать последний символ строки. Используем метод String.charAt().
// 4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
// 5 Заменить все символы “а” на “о”.
// 6 Преобразуйте строку к верхнему регистру.
// 7 Преобразуйте строку к нижнему регистру.
// 8 Вырезать строку Java c помощью метода String.substring().

  public static void main(String[] args) {
// 1 Создайте строку через new - I study Basic Java!
    String textOne = new String("I study Basic Java!");

// 2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
    printText(textOne);
  }

  public static void printText(String text) {
    String line = "---------------------------------------------------------------------------";

    System.out.println(line);
    System.out.println("2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1");
    System.out.println(text);

    System.out.println(line);
    System.out.println("3 Распечатать последний символ строки. Используем метод String.charAt().");
    if (text.length() > 0) {
      char lastChar = text.charAt(text.length() - 1);

      System.out.printf("Last char in text: %c\n", lastChar);
    } else {
      System.out.println("Text is empty!");
    }

    System.out.println(line);
    System.out.println("4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().");
    String findText = "Java";
    System.out.printf("Is text contains '%s' : %b\n", findText, text.contains(findText));

    System.out.println(line);
    System.out.println("5 Заменить все символы “а” на “о”.");
    System.out.printf("old String: '%s'\n", text);
    System.out.printf("new String: '%s'\n", text.replace('a', 'o'));

    System.out.println(line);
    System.out.println("6 Преобразуйте строку к верхнему регистру.");
    System.out.printf("old String: '%s'\n", text);
    System.out.printf("new String: '%s'\n", text.toUpperCase());

    System.out.println(line);
    System.out.println("7 Преобразуйте строку к нижнему регистру.");
    System.out.printf("old String: '%s'\n", text);
    System.out.printf("new String: '%s'\n", text.toLowerCase());

    System.out.println(line);
    System.out.println("8 Вырезать строку Java c помощью метода String.substring().");
    System.out.printf("old String: '%s'\n", text);
    findText = "Java";
    if (text.indexOf(findText) > 0) {
      String modifiedText =
              text.substring(0, text.indexOf(findText)) +
                      text.substring(text.indexOf(findText) + findText.length(), text.length());
      System.out.printf("new String: '%s'\n", modifiedText);
    } else {
      System.out.printf("Not found string '%s' in old text\n", findText);
    }
  }
}
