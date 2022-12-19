package homework2;

import java.util.Scanner;

public class Task3_Calculator {
  public static void main(String[] args) {
//  Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления двух чисел.
//  Каждая из арифметических операций должна быть реализована как отдельный метод.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, Enter 1 - Number (int): ");
    int numberOne = scanner.nextInt();

    System.out.println("Please, Enter 2 - Number (int): ");
    int numberTwo = scanner.nextInt();

    double numberResult = 0;
    String formatResult = "%d %c %d = %.2f\n";

    numberResult = doAddition(numberOne, numberTwo);
    System.out.printf(formatResult, numberOne, '+', numberTwo, numberResult);

    numberResult = doSubtraction(numberOne, numberTwo);
    System.out.printf(formatResult, numberOne, '-', numberTwo, numberResult);

    numberResult = doMultiplication(numberOne, numberTwo);
    System.out.printf(formatResult, numberOne, '*', numberTwo, numberResult);

    if (numberTwo == 0) {
      System.out.println("division by zero is not allowed");
    } else {
      numberResult = doDivision(numberOne, numberTwo);
      System.out.printf(formatResult, numberOne, '/', numberTwo, numberResult);
    }
  }

  public static double doAddition(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
  }

  public static double doSubtraction(int numberOne, int numberTwo) {
    return numberOne - numberTwo;
  }

  public static double doMultiplication(double numberOne, double numberTwo) {
    return numberOne * numberTwo;
  }

  public static double doDivision(double numberOne, double numberTwo) {
    return numberOne / numberTwo;
  }

}
