package homework1_2;

public class Main {
  public static void main(String[] args) {
    int numThreeSymbol = 987;

    //1 variant
    String strThreeSymbol = String.valueOf(numThreeSymbol);
    System.out.println("By 1 method...");
    System.out.printf("1 - symbol: %s\n", strThreeSymbol.charAt(0));
    System.out.printf("2 - symbol: %s\n", strThreeSymbol.charAt(1));
    System.out.printf("3 - symbol: %s\n", strThreeSymbol.charAt(2));

    //2-variant
    System.out.println("\nBy 2 method...");
    System.out.print("1 - symbol: ");
    System.out.println(numThreeSymbol / 100);
    System.out.print("2 - symbol: ");
    System.out.println(numThreeSymbol / 10 % 10);
    System.out.print("3 - symbol: ");
    System.out.println(numThreeSymbol % 10);
  }
}