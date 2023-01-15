package homework4.arrays_for_loop;

import java.util.Scanner;

public class UserInterface {
  public static int userArraySizeInput(String message){
    Scanner scanner = new Scanner(System.in);

    System.out.println(message);

    return scanner.nextInt();
  }
}
