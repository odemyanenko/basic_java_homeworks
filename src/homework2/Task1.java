package homework2;

public class Task1 {
  /*
First level: Задание №1.
1. Перевести число 333 из шестнадцатиричной в десятичную
2. Разложить число 200345 на разряды в десятичной системе
3. Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
4. Перевести 637 из десятичной в двоичную
5. 11100111 перевести в десятичную
6. Перевести 637 из десятичной в троичную
  */
  public static void main(String[] args) {
    String line = "---------------------------------------------------------------------------";

    System.out.println(line);
    System.out.println("1. Перевести число 333 из шестнадцатиричной в десятичную");
    String numHex = "333";
    System.out.printf("Number (16) / Number (10)\n%s / %d\n", numHex, Integer.parseInt(numHex,16));

    System.out.println(line);
    System.out.println("2. Разложить число 200345 на разряды в десятичной системе");
    int numOne = 200345;
    printRankNumberInRadix(numOne, 10);

    System.out.println(line);
    System.out.println("3. Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)");
    int numDec = 637;
    numHex = Integer.toHexString(numDec);
    System.out.printf("Number (10) -> Number (16) -> Number (10)\n%d -> %s -> %d\n",
            numDec, numHex, Integer.parseInt(numHex, 16));

    System.out.println(line);
    System.out.println("4. Перевести 637 из десятичной в двоичную");
    numDec = 637;
    System.out.printf("Number (10) / Number (2)\n%d / %s\n", numDec, Integer.toBinaryString(numDec));

    System.out.println(line);
    System.out.println("5. 11100111 перевести в десятичную");
    String numBinary = "11100111";
    System.out.printf("Number (2) / Number (10)\n%s / %d\n", numBinary, Integer.parseInt(numBinary,2));

    System.out.println(line);
    System.out.println("6. Перевести 637 из десятичной в троичную");
    numDec = 637;
    System.out.printf("Number (10) / Number (3)\n%d / %s\n", numDec, Integer.toString(numDec, 3));

  }

  public static void printRankNumberInRadix(Integer number, int radix){
    int numTemp = number;
    String result = "";
    int numRank = 0;

    while (numTemp > 0) {
      if (result.length() > 0) {
        result += " + ";
      }
      else {
        result += number + " = ";
      }
      result += String.format("%d*%s^%d", numTemp%10, radix, numRank);

      numTemp /= 10;
      numRank++;
    }
    System.out.println(result);
  }

}
