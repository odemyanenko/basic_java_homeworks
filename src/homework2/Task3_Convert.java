package homework2;

import java.util.Scanner;

public class Task3_Convert {
  public static void main(String[] args) {
//    реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США

    doConvertEuroToDollars();
  }

  public static void doConvertEuroToDollars() {
    float multiplier = 1.01f;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter amount in Euro:");
    float sumEuro = scanner.nextFloat();

    System.out.printf("Summa in Euro: %.2f, Dollars: %.2f (multiplier = %.2f)", sumEuro, sumEuro * multiplier, multiplier);
  }
}
