package homework5;

import java.util.Scanner;

public class UserInterface {
  Scanner scanner = new Scanner(System.in);

  public int intUserInput(String message) {
    System.out.println(message);
    return scanner.nextInt();
  }

  public int intUserInput(String message, int minBound) {
    int inputValue = 0;

    while (inputValue < minBound) {
      System.out.println(message);
      inputValue = scanner.nextInt();
    }

    return inputValue;
  }
}
