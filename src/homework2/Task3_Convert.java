package homework2;

import java.util.Scanner;

public class Task3_Convert {
  public static void main(String[] args) {
//    реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
    CurrencyConvertor currencyConvertor = new CurrencyConvertor();

    float amountEuro = currencyConvertor.getAmountEuro();
    float multiplier = currencyConvertor.getMultiplier();
    System.out.printf("Summa in Euro: %.2f, Dollars: %.2f (multiplier = %.2f)",
            amountEuro,
            currencyConvertor.doConvertEuroToDollars(amountEuro, multiplier),
            multiplier);
  }
}
