package homework2_extra;

import java.util.Scanner;

public class StringDemo {
  public static void main(String[] args) {
    /*
Тема: создание переменной типа String.
Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль значение этой переменной.
    */
    String name = "Olga";
    System.out.println(name);

//    Тема: Конкатенация строк.
//    Напишите программу в которой создайте переменную
//    типа String и присвойте ей в качестве начального значения
//    ваше имя. Выведете на консоль приветствие типа "Hi YourName".
    String greeting = "Hi " + name + "!";
    System.out.println(greeting);

//    Тема: Считывание строк с консоли.
//    Программа должна спрашивать как зовут пользователя,
//    считывать его имя с консоли и выводить приветствие
//    в виде: "Hello UserName!".
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter Your Name...");
    String inputName = scanner.nextLine();
    System.out.printf("Hello %s!\n", inputName);
  }
}
