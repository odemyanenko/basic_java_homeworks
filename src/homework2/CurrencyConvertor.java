package homework2;

import java.util.Scanner;

public class CurrencyConvertor {
  public float getAmountEuro(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter amount in Euro:");
    return scanner.nextFloat();
  }

  public float getMultiplier(){
    return 1.01f;
  }

  public float doConvertEuroToDollars(float amount, float multiplier) {
    return amount * multiplier;
  }
}
