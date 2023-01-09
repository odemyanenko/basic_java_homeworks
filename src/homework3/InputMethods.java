package homework3;

import java.util.Scanner;

public class InputMethods {
  static Scanner scanner = new Scanner(System.in);
  public static boolean getBooleanValue(char charValue){

    switch (charValue) {
      case 'Y':
        return true;
      default:
        return false;
    }

  }
  public static char getUserCharValue(String message){

    char result;
    boolean isExit = false;

    do {
      System.out.println(message);
      result = scanner.next().toUpperCase().charAt(0);
      isExit = (result == 'Y') || (result == 'N') ? true : false;
    } while (!isExit);

    return result;
  }

  public static int getUserIntegerValue(String message){

    int result = 0;
    boolean isExit = false;

    do {
      System.out.println(message);

      isExit = scanner.hasNextInt();
      result = scanner.hasNextInt() ? scanner.nextInt() : 0;
      if (!isExit) {
        System.out.println("That is not Number! Try again!");
        scanner.next();
      }

    } while (!isExit);

    return result;
  }

  public static int getUserIntegerPositiveValue(String message){

    int result = 0;
    boolean isExit = false;

    do {
      System.out.println(message);

      isExit = scanner.hasNextInt();
      result = scanner.hasNextInt() ? scanner.nextInt() : 0;
      if (!isExit) {
        System.out.println("That is not Number! Try again!");
        scanner.next();
      }
      else {
        isExit = result > 0;
        if (!isExit) {
          System.out.printf("This Number (%d) should be > 0! Try again!\n", result);
          result = 0;
        }
      }

    } while (!isExit);

    return result;
  }

  public static int getUserIntegerPositiveValue(String message, int maxValue){

    int result = 0;
    boolean isExit = false;

    do {
      System.out.println(message);

      isExit = scanner.hasNextInt();
      result = scanner.hasNextInt() ? scanner.nextInt() : 0;

      if (!isExit) {
        System.out.println("That is not Number! Try again!");
        scanner.next();
      }
      else {
        isExit = result > 0;
        if (!isExit) {
          System.out.printf("This Number (%d) should be > 0! Try again!\n", result);
          result = 0;
        }
        else {
          isExit = result < maxValue;
          if (!isExit) {
            System.out.printf("This Number (%d) greater max (%d) ! Try again!\n", result, maxValue);
            result = 0;
          }
        }
      }

    } while (!isExit);

    return result;
  }
}
